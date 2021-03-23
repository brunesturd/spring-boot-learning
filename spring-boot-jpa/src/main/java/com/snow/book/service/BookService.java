package com.snow.book.service;

import com.snow.book.entity.Book;

import java.util.List;

/**
 * @author asus
 */
public interface BookService {

    /**
     * 新增book
     *
     * @param book 入参
     * @return 新增book对象
     */
    Book save(Book book);

    /**
     * 查询所有book
     *
     * @return 图书集合
     */

    List<Book> getAll();
}
