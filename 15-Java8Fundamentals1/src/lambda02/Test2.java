package lambda02;

public class Test2 {
    public static void main(String[] args) {
        Max ref1 = (n1, n2) -> {
            int result = (n1 > n2) ? n1 : n2;
            return result;
        };

        Max ref2 = (n1, n2) -> (n1 > n2) ? n1 : n2;

        System.out.println("Max 1= "+ref1.max(5, 2));
        System.out.println("Max 2= "+ref1.max(1, 2));

        System.out.println("Max 3"+ref2.max(12, 35));
        System.out.println("Max 4"+ref2.max(35, 12));
    }
}
