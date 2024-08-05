package collection04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void printList(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
        }
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(1005, "Mohit", 81);
        Student student2 = new Student(1001, "Janvi", 70);
        Student student3 = new Student(1003, "Gurudev", 82);
        Student student4 = new Student(1004, "Siddhart", 71);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        System.out.println("Original List");
        printList(list);
        Collections.sort(list); // this will use Comparable --> compareTo method to perform sorting.
        System.out.println("Sorted List");
        printList(list);

        Collections.sort(list, new StudentScoreSorter());
        System.out.println("Sorted based on student score");
        printList(list);
    }
}
