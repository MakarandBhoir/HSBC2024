package thread03;

public class Test {
    public static void main(String[] args) {
        // Task - 1: print 1 - 20 odd numbers
        Task1 task1 = new Task1(); // odd numbers

        // Task - 2: print 1 - 20 even numbers
        Task2 task2 = new Task2(); // even numbers

        Thread t1 = new Thread(task1); // worker thread 1 // NEW
        Thread t2 = new Thread(task2); // worker thread 2 // NEW

        t1.start(); // RUNNABLE QUEUE
        t2.start(); // RUNNABLE QUEUE
        System.out.println("End of main therad.");
    }
}
