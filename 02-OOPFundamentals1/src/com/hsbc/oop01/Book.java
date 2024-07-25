package com.hsbc.oop01;

public class Book {
    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    public Book(){
        this("", "", -1);
    }
    public Book(String bookName, String bookAuthor, double bookPrice){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    public void displayBook(){
        System.out.println("Book Name = "+this.bookName);
        System.out.println("Book Author = "+bookAuthor);
        System.out.println("Book Price = "+bookPrice);
        System.out.println("----------------------------");
    }
}
