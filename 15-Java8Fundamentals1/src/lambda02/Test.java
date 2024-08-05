package lambda02;

public class Test {
    public static void main(String[] args) {
        //1. We are not creating a separate class to implement functional interface
        //2. No need of override method explicitly
        //3. We are defining body of method
        //4. If body contains more than 1 line, then it should be included in { }
        //5. while defining arguments or parameters it is optional to define type of parameter
        Max ref = (int num1, int num2) -> {
            if(num1 > num2){
                return num1;
            }else{
                return num2;
            }
        };

        int result = ref.max(10, 20);
        System.out.println("Result = "+result);
    }
}
