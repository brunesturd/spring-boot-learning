package com.snow.book.controller;

import com.snow.book.entity.Book;
import com.snow.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public String bookPage(Model model){
        model.addAttribute("message","图书页面");
        List<Book> bookList =bookService.getAll();
        model.addAttribute("bookList",bookList);
        return "book";
    }
}
