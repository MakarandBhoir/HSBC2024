package lambda01;

public class Test {
    public static void main(String[] args) {
        Max ref = new MaxImpl();

        int result = ref.max(100, 200);
        System.out.println("Max = "+result);

        ref.defaultMeth();

        Max.staticMeth();
    }
}
