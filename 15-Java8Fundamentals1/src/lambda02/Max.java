package lambda02;
@FunctionalInterface
public interface Max {
    public abstract int max(int n1, int n2);
    public static void staticMeth(){
        System.out.println("static method.");
    }
    public default void defaultMeth(){
        System.out.println("default method.");
    }
}
