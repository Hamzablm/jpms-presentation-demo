package com.dao;


import com.example.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Effective Java", 30, false));
        books.add(new Book(2, "The Java Module System", 30, true));
        return books;
    }

}
