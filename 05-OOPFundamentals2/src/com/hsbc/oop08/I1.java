package com.hsbc.oop08;

public interface I1 {
    public static final int x = 1000;
    public abstract void meth1();
}
abstract class C1 implements I1{

}
class C2 extends C1{
    public void meth1(){
        System.out.println("Learning interface concepts. ==> "+I1.x);
    }
}
class Test{
    public static void main(String[] args) {
        I1 ref = new C2();
        ref.meth1();
    }
}