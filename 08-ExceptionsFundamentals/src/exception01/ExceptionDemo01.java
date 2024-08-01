package exception01;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("Program Started.");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        double res = num1 / num2;
        System.out.println("Result = "+res);
    }
}
