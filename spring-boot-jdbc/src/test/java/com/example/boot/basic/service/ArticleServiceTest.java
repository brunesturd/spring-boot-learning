package com.example.boot.basic.service;

import com.example.boot.basic.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ArticleServiceTest {

    @Resource
    private ArticleService articleService;

    @Test
    void postArticle() {
        Article article = Article.builder()
                .id(3)
                .title("demoData")
                .content("demoData")
                .author("inky")
                .updateTime(new Date())
                .build();
        log.info("article" + article);
        boolean flag = articleService.postArticle(article);
        log.info("flag" + flag);
        assertTrue(flag);
    }

    @Test
    void selectAll() {
        List<Article> articles = articleService.getAll();
        assertEquals(2, articles.size());
        //articles.forEarch(System.out::println);
        articles.forEach(article -> {
            log.info("author" + article.getAuthor());
            log.info("title" + article.getTitle());
        });
    }

    @Test
    void delete() {
        boolean flag = articleService.deleteArticle(2);
        assertTrue(flag);

    }

    @Test
    void findById() {
        Article realArticle = articleService.getById(1);
        Article expectedArticle = Article.builder()
                .id(1)
                .title("test")
                .content("test")
                .author("inky")
                .updateTime(new Date())
                .build();
        log.info("expectedArticle-----" + expectedArticle);
        assertEquals(expectedArticle, realArticle);
    }

    @Test
    void update() {
        Article article = Article.builder()
                .id(1)
                .title("SNOW")
                .content("white")
                .author("inky")
                .updateTime(new Date())
                .build();
        boolean flag = articleService.updateArticle(article);
        log.info("article" + article);
        log.info("flag" + flag);
        assertTrue(flag);
    }

}