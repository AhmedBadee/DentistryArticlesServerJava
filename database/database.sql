CREATE SCHEMA Articles;
USE Articles;
CREATE TABLE Articles_T(
  articleId INT NOT NULL AUTO_INCREMENT UNIQUE,
  articleTitle VARCHAR(100) NOT NULL UNIQUE,
  articleBrief TEXT NOT NULL,
  articleBody TEXT NOT NULL,
  community_professional BOOL NOT NULL,
  images_urls TEXT,
  CONSTRAINT article_pk PRIMARY KEY (articleId)
);