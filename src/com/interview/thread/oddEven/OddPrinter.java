package interview.thread.oddEven;

public class OddPrinter implements Runnable {
    private int maxValue;
    private Printer printer;

    public OddPrinter(int maxValue, Printer printer) {
        this.maxValue = maxValue;
        this.printer = printer;
    }

    @Override
    public void run() {
        for(int i=1;i<maxValue;i+=2){
            try {
                printer.printOdd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
