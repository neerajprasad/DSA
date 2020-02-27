package java.interview.thread.prodCons;

import java.util.List;

public class Producer implements Runnable {
    int maxSize=2;
    private List<Integer> sharedQueue;

    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void produce(int i) throws InterruptedException {

        synchronized (sharedQueue) {
            if(sharedQueue.size()==maxSize){
                System.out.println("Queue is full, producerThread is waiting for "
                        + "consumerThread to consume, sharedQueue's size= "+maxSize);
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue){
            System.out.println("produce "+i);
            sharedQueue.add(i);
            Thread.sleep((long)(Math.random() * 1000));
            sharedQueue.notifyAll();
        }
    }
}
