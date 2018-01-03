package Entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "Articles_T", schema = "Articles")
public class ArticlesEntity {

    private int articleId;
    private String articleTitle;
    private String articleBrief;
    private String articleBody;
    private boolean community_professional;
    private String images_urls;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "articleId")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "articleTitle")
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "articleBrief")
    public String getArticleBrief() {
        return articleBrief;
    }

    public void setArticleBrief(String articleBrief) {
        this.articleBrief = articleBrief;
    }

    @Basic
    @Column(name = "articleBody")
    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    /*
       true  - 1 for community
       false - 0 for professional
     */
    @Basic
    @Column(name = "community_professional")
    public boolean getCommunity_professional() {
        return community_professional;
    }

    public void setCommunity_professional(boolean community_professional) {
        this.community_professional = community_professional;
    }

    @Basic
    @Column(name = "images_urls")
    public String getImages_urls() {
        return images_urls;
    }

    public void setImages_urls(String image_urls) {
        this.images_urls = image_urls;
    }
}
