package thread03;

public class Task2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=20; i++){
            if(i % 2 == 0){
                System.out.println("Even Number = "+i);
                try {
                    Thread.sleep(1500);
                }catch (InterruptedException e){
                    System.out.println("Thread interrupted");
                }
            }
        }
    }
}
