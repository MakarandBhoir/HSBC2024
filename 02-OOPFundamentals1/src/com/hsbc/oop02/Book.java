package com.hsbc.oop02;

public class Book {
    // instance variables
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    // class variable
    private static double bookDiscount;

    public Book(){
        this("", "", -1);
    }
    public Book(String bookName, String bookAuthor, double bookPrice){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    static{
        System.out.println("Static block of Book.");
        Book.bookDiscount = 5.0;
    }
    public static void setBookDiscount(double bookDiscount){
        Book.bookDiscount = bookDiscount;
    }
    private double calcDiscountAmount(){
        double actualPrice = bookPrice - ((bookDiscount/100)*bookPrice);
        return actualPrice;
    }
    public void displayBook(){
        System.out.println("Book Name = "+this.bookName);
        System.out.println("Book Author = "+bookAuthor);
        System.out.println("Original Book Price = "+bookPrice);
        System.out.println("Discounted Book Price = " + calcDiscountAmount());
        System.out.println("----------------------------");
    }
}
