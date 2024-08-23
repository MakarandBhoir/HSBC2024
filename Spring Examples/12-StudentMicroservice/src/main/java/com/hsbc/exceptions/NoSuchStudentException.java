package com.hsbc.exceptions;

public class NoSuchStudentException extends Exception{
    public NoSuchStudentException(){

    }
    public NoSuchStudentException(String message){
        super(message);
    }
    public NoSuchStudentException(String message, Throwable e){
        super(message, e);
    }
}
