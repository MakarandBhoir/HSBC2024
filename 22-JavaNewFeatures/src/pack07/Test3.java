package pack07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Test3 {
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

        // object stream
        // primitive stream - IntStream, LongStream, DoubleStream
        DoubleStream doubleStream = list.stream()
                                    .mapToDouble(student -> student.getStudentScore() );

        double count = doubleStream.count();
        double max = list.stream().mapToDouble(s->s.getStudentScore()).max().getAsDouble();
        double min = list.stream().mapToDouble(s->s.getStudentScore()).min().getAsDouble();
        double avg = list.stream().mapToDouble(s->s.getStudentScore()).average().getAsDouble();
        double sum = list.stream().mapToDouble(s->s.getStudentScore()).sum();
    }
}
