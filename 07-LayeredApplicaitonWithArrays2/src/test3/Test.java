package test3;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person p1 = new Person("Nirmal", 21);
        Person p2 = (Person) p1.clone();
        Person p3 = p1;
        p1.age = 30;

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println("----------------------");
        System.out.println(p2.age); // age = 21
        System.out.println(p3.age); // age = 30
    }
}
