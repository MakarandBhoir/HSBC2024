package thread04;

public class Task1 implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=20; i++){
            if(i % 2 == 1){
                System.out.println("Odd Number = "+i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println("Thread interrupted");
                }
            }
        }
    }
}
