package pack07;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "Arya", 84);
        Student student2 = new Student(1002, "Harsh", 70);
        Student student3 = new Student(1002, "Harsh", 70);
        Student student4 = new Student(1004, "Rishabh", 79);
        Student student5 = new Student(1004, "Shaili", 75);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Stream<Student> stm1 = list.stream();
        Function<Student, String> function = (Student student) -> student.getStudentName();
        Stream<String> stm2 = stm1.map(function);
        stm2.forEach(e -> System.out.println(e));

        list.stream().map( e -> e.getStudentName() ).forEach(e -> System.out.println(e));

        List<String> nameList = list.stream()
                .map(e -> e.getStudentName())
                .collect(Collectors.toList());
    }
}
