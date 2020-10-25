package com.example.domain;
import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private double price;
    private boolean hasCoupon;

    public Book(int id, String name, double price, boolean hasCoupon) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasCoupon = hasCoupon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hasCoupon=" + hasCoupon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Double.compare(book.price, price) == 0 &&
                hasCoupon == book.hasCoupon &&
                name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, hasCoupon);
    }
}
