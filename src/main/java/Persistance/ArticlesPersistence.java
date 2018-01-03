package Persistance;

import Entities.ArticlesEntity;

import javax.persistence.*;
import java.util.List;

public class ArticlesPersistence {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ArticlesPersistence() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Articles");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public String createArticle(ArticlesEntity article) {
        entityManager.getTransaction().begin();

        entityManager.persist(article);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return article.getArticleTitle() + " has been created successfully";
    }

    public List<ArticlesEntity> getAllArticles() {
        TypedQuery<ArticlesEntity> query = entityManager
                .createQuery("select a from ArticlesEntity a", ArticlesEntity.class);

        List<ArticlesEntity> articles = query.getResultList();

        entityManager.close();
        entityManagerFactory.close();

        return articles;
    }

    public ArticlesEntity getArticleById(int id) {
        TypedQuery<ArticlesEntity> query = entityManager
                .createQuery("select a from ArticlesEntity a where a.articleId = " + id,
                                ArticlesEntity.class);

        ArticlesEntity article = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return article;
    }

    public ArticlesEntity getArticleByTitle(String articleTitle) {
        TypedQuery<ArticlesEntity> query = entityManager
                .createQuery("select a from ArticlesEntity a where a.articleTitle LIKE '" + articleTitle + "'",
                        ArticlesEntity.class);

        ArticlesEntity article = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return article;
    }

    public String updateArticleById(int id, ArticlesEntity article) {
        entityManager.getTransaction().begin();

        TypedQuery<ArticlesEntity> query = entityManager
                .createQuery("update ArticlesEntity a set " +
                                "a.articleTitle = \"" + article.getArticleTitle() +
                                "\", a.articleBrief = \"" + article.getArticleBrief() +
                                "\", a.articleBody = \"" + article.getArticleBody() +
                                "\", a.community_professional = " + article.getCommunity_professional() +
                                ", a.images_urls = \"" + article.getImages_urls() +
                                "\"where a.articleId = " + id,
                                ArticlesEntity.class);

        int updated = query.executeUpdate();

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        if (updated > 0)
            return "Article \"" + article.getArticleTitle() + "\" updated successfully";
        else
            return "Error happened!!!";

    }

    public String deleteArticleById(int id) {
        entityManager.getTransaction().begin();

        TypedQuery<ArticlesEntity> selectQuery = entityManager
                .createQuery("select a from ArticlesEntity a where a.articleId = " + id,
                                ArticlesEntity.class);

        ArticlesEntity article = selectQuery.getSingleResult();

        TypedQuery<ArticlesEntity> deleteQuery = entityManager
                .createQuery("delete from ArticlesEntity a where a.articleId = " + id,
                                ArticlesEntity.class);

        int deleted = deleteQuery.executeUpdate();

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        if (deleted > 0)
            return "Article \"" + article.getArticleTitle() + "\" deleted successfully";
        else
            return "Error happened!!!";
    }
}
