package com.demo.service;

import com.dao.BookDao;
import com.demo.impl.CouponCalculator;
import com.example.domain.Book;

import java.util.List;

public class BookService {

    private final double percentage = 0.25;

    public List<Book> getBooks() {
        BookDao bookDao = new BookDao();
        final List<Book> allBooks = bookDao.getAllBooks();
        allBooks.forEach(book -> CouponCalculator.calculatePrice(book, percentage));
        return allBooks;
    }

}
