package com.example.main;

import com.demo.service.BookService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAccessTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        final Class<?> bookClass = Class.forName("com.demo.service.BookService");
        final BookService book = (BookService) bookClass.getConstructors()[0].newInstance();

        final Field percentage = bookClass.getDeclaredFields()[0];
        percentage.setAccessible(true);
        System.out.println(percentage.getDouble(book));
    }

}
