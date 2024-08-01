package exception04;

public class Hockey {
    public static void main(String[] args) {
        try {
            System.out.println('A');
            throw new RuntimeException("Char not allowed!");
        }
        catch (RuntimeException e){
            System.out.println("B1");
        }
        catch (Exception e) {
            System.out.println("B2");
            throw e;
        }
        finally {
            System.out.println('C');
        }
    }
}