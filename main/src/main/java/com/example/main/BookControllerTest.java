package com.example.main;

import com.demo.service.BookService;
import com.example.domain.Book;

import java.util.List;

public class BookControllerTest {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        final List<Book> books = bookService.getBooks();
        System.out.println(books);
    }

}
