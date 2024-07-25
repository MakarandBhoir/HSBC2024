//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int x;
    public static void main(String[] args) {
        int number1 = Integer.parseInt( args[0] );
       int number2 = Integer.parseInt( args[1] );
       int result = Main.findMax(number1, number2);
       System.out.println("Result = "+result);
    }
    public static int findMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

}