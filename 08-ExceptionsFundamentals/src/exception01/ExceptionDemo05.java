package exception01;

public class ExceptionDemo05 {
    private static String str;
    public static void main(String[] args) {
        System.out.println("Program started.");
        int index = -1;
        if(str != null) {
            index = str.indexOf('m');
        }
        System.out.println("Position of char is = "+index);
        System.out.println("Program ended.");
    }
}
