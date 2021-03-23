package com.snow.book.repository;

import com.snow.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author asus
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
}
