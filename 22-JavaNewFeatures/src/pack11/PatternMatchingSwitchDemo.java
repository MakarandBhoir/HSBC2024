package pack11;

class Student{

}

public class PatternMatchingSwitchDemo {
    static double getDoubleUsingIf(Object o) {
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = ((String)o).length();
        } else {
            result = 0d;
        }
        return result;
    }
    static double getDoubleUsingImprovedIO(Object o) {
        double result;
        if (o instanceof Integer i) {
            result = i.doubleValue();
        } else if (o instanceof Float f) {
            result = f.doubleValue();
        } else if (o instanceof String s) {
            result = s.length();
        } else {
            result = 0d;
        }
        return result;
    }
    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
    static void displayType(Object o){
        switch (o){
            case Integer i -> System.out.println("Integer");
            case Float f -> System.out.println("Float");
            case String s -> System.out.println("String");
            case Student s2 -> System.out.println("Student");
            default -> System.out.println("Other");
        }
    }
    public static void main(String[] args) {
        Student s2 = new Student();
        displayType(s2);
    }
}
