package com.example.boot.basic.service;

import com.example.boot.basic.entity.Article;

import java.util.List;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/16
 **/
public interface ArticleService {

    /**
     * 发布文章
     *
     * @param article article对象
     * @return boolean
     */

    boolean postArticle(Article article);

    /**
     * 根据id删除文章
     *
     * @param id 文章id
     * @return 删除是否成功
     */
    boolean deleteArticle(int id);

    /**
     * 更新文章
     *
     * @param article article对象
     * @return 更新是否成功
     */
    boolean updateArticle(Article article);

    /**
     * 根据id查询文章
     *
     * @param id id
     * @return 查询到的文章对象
     */
    Article getById(int id);

    /**
     * 查询所有文章
     *
     * @return 所有文章列表
     */
    List<Article> getAll();
}
