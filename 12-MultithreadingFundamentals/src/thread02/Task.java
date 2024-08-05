package thread02;

public class Task extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("Thread name who is doing task = "+name);
    }
}
