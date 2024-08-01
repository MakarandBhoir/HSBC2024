package test3;

public class Person implements Cloneable {
    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
