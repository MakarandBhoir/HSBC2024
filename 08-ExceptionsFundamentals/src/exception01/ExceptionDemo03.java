package exception01;

import java.io.IOException;

public class ExceptionDemo03 {
    public void meth1(){
        System.out.println("meth1 is called.");
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        System.out.println("Program is stared.");
        new ExceptionDemo03().meth1();
        System.out.println("Program is ended.");
    }
}
