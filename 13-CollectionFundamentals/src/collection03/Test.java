package collection03;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        //set = new LinkedHashSet<>();
        //set = new TreeSet<>();
        Student student1 = new Student(1001, "Arya", 84);
        Student student2 = new Student(1002, "Harsh", 70);
        Student student3 = new Student(1002, "Harsh", 70);
        Student student4 = new Student(1004, "Rishabh", 79);
        Student student5 = new Student(1004, "Shaili", 75);

        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);

        Iterator<Student> itr = set.iterator();
        while(itr.hasNext()){
            Student student = itr.next();
            System.out.println(student);
        }
    }
}
