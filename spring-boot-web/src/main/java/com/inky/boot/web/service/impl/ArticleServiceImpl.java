package com.example.boot.basic.service.impl;

import com.example.boot.basic.dao.ArticleDAO;
import com.example.boot.basic.entity.Article;
import com.example.boot.basic.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/16
 **/
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDAO articleDAO;


    @Override
    public boolean postArticle(Article article){
        Article saveArticle = articleDAO.save(article);
//        int [][] array = {{1,2,3},{1,4}};
//        System.out.println(array[1][2]);
        return saveArticle !=null;
    }


    @Override
    public boolean deleteArticle(int id) {
        int row = articleDAO.deletById(id);
        return row != 0;
    }

    @Override
    public boolean updateArticle(Article article) {
        int row=articleDAO.update(article);
        return row != 0;
    }

    @Override
    public Article getById(int id) {
        return articleDAO.findById(id);
    }

    @Override
    public List<Article> getAll() {
        return articleDAO.findAll();
    }



}
