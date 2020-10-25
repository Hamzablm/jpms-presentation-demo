package com.demo.impl;


import com.example.domain.Book;

public class CouponCalculator {

    public static void calculatePrice(Book book, double percentage) {
        if (book.hasCoupon()) {
            book.setPrice(book.getPrice() - (book.getPrice() * percentage));
        }
    }

}
