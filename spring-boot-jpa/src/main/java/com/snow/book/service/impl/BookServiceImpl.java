package com.snow.book.service.impl;

import com.snow.book.entity.Book;
import com.snow.book.repository.BookRepository;
import org.springframework.expression.spel.ast.InlineList;
import org.springframework.transaction.annotation.Transactional;
import com.snow.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    
}


