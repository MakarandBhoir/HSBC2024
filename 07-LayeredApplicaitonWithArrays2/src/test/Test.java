package test;

import com.hsbc.factory.StudentDaoFactory;

public class Test {
    public static void main(String[] args) {
        //StudentDaoFactory dao1 = new StudentDaoFactory();
        //StudentDaoFactory dao2 = new StudentDaoFactory();

        StudentDaoFactory dao1 = StudentDaoFactory.getInstance();
        StudentDaoFactory dao2 = StudentDaoFactory.getInstance();


        System.out.println(dao1.hashCode());
        System.out.println(dao2.hashCode());

    }
}
