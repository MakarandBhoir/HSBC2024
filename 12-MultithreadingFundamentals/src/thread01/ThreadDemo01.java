package thread01;

public class ThreadDemo01 {

    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("Thread Name = "+name);
    }

    public static void main(String[] args) {
        new ThreadDemo01().run();
    }
}
