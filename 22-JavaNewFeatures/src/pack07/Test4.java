package pack07;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
public class Test4 {
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

        //BiFunction<Double, Double, Double> function = (n1, n2) -> n1 + n2;

        BinaryOperator<Double> function1 = (n1, n2) -> n1 + n2;
        Optional<Double> result1 = list.stream().map(s -> s.getStudentScore()).reduce( function1 );

        BinaryOperator<Double> function2 = (n1, n2) -> (n1 > n2) ? n1 : n2;
        double max = list.stream().map(s->s.getStudentScore()).reduce(function2).get();

        BinaryOperator<Student> function3 = (s1, s2) ->
                (s1.getStudentScore() > s2.getStudentScore()) ? s1 : s2;
        Student maxScore = list.stream().reduce(function3).get();

        double min = list.stream().map(s->s.getStudentScore()).reduce( (n1, n2) -> (n1<n2)?n1:n2 ).get();

    }
}
