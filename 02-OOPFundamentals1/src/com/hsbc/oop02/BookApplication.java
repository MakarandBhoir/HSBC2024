package com.hsbc.oop02;

public class BookApplication {
    static {
        System.out.println("Static block of Book Application.");
    }
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Cay Horstman", 1100.5);
        Book book2 = new Book("C", "Kanetkar", 400.5);

        Book.setBookDiscount(10.75);

        book1.displayBook();
        book2.displayBook();
    }
}
