package collection06;

import java.util.*;

public class Test {
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

        System.out.println("Do you want to perform sorting based on:\n1. Name\n2. Id\n3. Score");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                Comparator<Student> comparator =
                        (s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName());
                Collections.sort(list, comparator);
                break;
            case 2:
                Collections.sort(list, (s1, s2)-> (s1.getStudentId() > s2.getStudentId())? 1 : -1 );
                break;
            case 3:
                //Collections.sort(list, new StudentScoreSorter());
                break;
            default:

        }
    }
}
