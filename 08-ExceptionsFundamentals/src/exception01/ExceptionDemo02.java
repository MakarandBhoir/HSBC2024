package exception01;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("Program Started.");
        double res = 0;
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            res = num1 / num2;
        }catch (ArithmeticException e){
            System.out.println("Number cant divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Program is expecting two arguments.");
        }
        catch (NumberFormatException e){
            System.out.println("Pass only number to program.");
        }
        System.out.println("Result = "+res);
    }
}
