package thread02;

public class ThreadDemo02 {
    public static void main(String[] args) {
        //Thread t1 = new Thread(); // worker thread
        Task task = new Task(); // New Thread
        //task.run();
        System.out.println("Thread state = "+task.getState());
        task.start(); // Runnable
        System.out.println("Thread state = "+task.getState());
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread state = "+task.getState()); // Terminated
        System.out.println("End of main.");
    }
}
