package java.interview.thread.prodCons;

import java.util.List;

public class Consumer implements Runnable {
    private List<Integer> sharedQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        try {
            while (true) {
                consume();
            }
//            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException {
        synchronized (sharedQueue) {
            if (sharedQueue.size() == 0) {
                System.out.println("currenlty queue is empty ");
                sharedQueue.wait();
            }
        }
        synchronized (sharedQueue) {
//            Thread.sleep(2000);
            System.out.println("Consuming value " + sharedQueue.remove(0));
            sharedQueue.notify();
        }
    }
}
