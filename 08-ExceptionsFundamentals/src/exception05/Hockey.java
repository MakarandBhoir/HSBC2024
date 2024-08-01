package exception05;

public class Hockey {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            throw new ClassCastException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(2);
            //throw e;
        } catch (RuntimeException e) {
            System.out.println(3);
            throw e;
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
