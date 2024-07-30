package com.hsbc.oop09;
interface I1{
    void meth1();
    public static void meth2(){
        System.out.println("Static method of I1");
    }
    private void meth3(){
        System.out.println("Private method of I1");
    }
    public default void meth4(){
        System.out.println("Default method impl");
    }
}
class C1 implements I1{
    public  void meth1(){
        System.out.println("meth1 of C1");
    }
}
public class Test {
    public static void main(String[] args) {
        I1 ref = new C1();
        ref.meth1();
        ref.meth4();
        I1.meth2();
    }
}
