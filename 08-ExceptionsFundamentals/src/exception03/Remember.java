package exception03;

public class Remember {
    public static void think() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        think();
    }
}