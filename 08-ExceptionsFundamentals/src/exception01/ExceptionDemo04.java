package exception01;

import java.io.IOException;

public class ExceptionDemo04 {
    public void meth2() throws IOException{
        System.out.println("meth2 is called.");
        throw new IOException();
    }
    public static void main(String[] args) {
        try {
            new ExceptionDemo04().meth2();
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
