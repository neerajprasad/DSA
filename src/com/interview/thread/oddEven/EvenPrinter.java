package interview.thread.oddEven;

public class EvenPrinter implements Runnable {
    private int maxValue;
    private Printer printer;

    public EvenPrinter(int maxValue, Printer printer) {
        this.maxValue = maxValue;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 2; i < maxValue; i += 2) {
            try {
                printer.printEven(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
