package java.interview.thread.oddEven;

public class Printer {
    private boolean isEven=false;
    public void printEven(int num) throws InterruptedException {
        synchronized (this){
            if(!isEven){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " - " + num);
            isEven =false;
            notify();
        }
    }

    public void printOdd(int num) throws InterruptedException {
        synchronized (this){
            if(isEven){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " - " + num);
            isEven =true;
            notify();
        }
    }
}
