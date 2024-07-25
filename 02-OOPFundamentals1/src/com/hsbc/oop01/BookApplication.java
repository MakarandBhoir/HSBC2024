package com.hsbc.oop01;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java", "Cay Horstman", 1100.5);

        book1.displayBook();
        book2.displayBook();

        book1 = book2;

        book1.displayBook();
        book2.displayBook();
    }
}
