package java.interview.thread.oddEven;

public class OddEvenMainThreadInitializer {
    public static void main(String[] args) throws InterruptedException {
        Printer printer= new Printer();
        Thread oddThread = new Thread(new OddPrinter(20,printer),"Odd Thread");
        Thread evenThread = new Thread(new EvenPrinter(20,printer),"Even Thread");

        oddThread.start();
        Thread.sleep(1000);
        evenThread.start();
    }
}
