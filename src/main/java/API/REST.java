package API;

import Entities.ArticlesEntity;
import Persistance.ArticlesPersistence;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class REST {

    @Inject
    private ArticlesPersistence articles;

    @POST
    @Path("/AddArticle")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String createArticle(ArticlesEntity article) {
        return articles.createArticle(article);
    }

    @GET
    @Path("/Articles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ArticlesEntity> getAllArticles() {
        return articles.getAllArticles();
    }

    @GET
    @Path("/Articles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArticlesEntity getArticleById(@PathParam("id") int id) {
        return articles.getArticleById(id);
    }

    @PUT
    @Path("/Articles/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateArticleById(@PathParam("id") int id, ArticlesEntity article) {
        return articles.updateArticleById(id, article);
    }

    @DELETE
    @Path("/Articles/{id}")
    public String deleteArticleById(@PathParam("id") int id) {
        return articles.deleteArticleById(id);
    }
}
