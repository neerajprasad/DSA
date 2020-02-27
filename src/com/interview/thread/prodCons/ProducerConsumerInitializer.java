package java.interview.thread.prodCons;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerInitializer {
    public static void main(String[] args) {
        List<Integer> sharedQueue = new ArrayList<>();
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);
        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread ConsumerThread = new Thread(consumer, "ConsumerThread");
        producerThread.start();
        ConsumerThread.start();

    }
}

/*
produce 0
Consuming value 0
currenlty queue is empty
produce 1
produce 2
Queue is full, producerThread is waiting for consumerThread to consume, sharedQueue's size= 2
Consuming value 1
Consuming value 2
currenlty queue is empty
produce 3
Consuming value 3
currenlty queue is empty
produce 4
produce 5
Queue is full, producerThread is waiting for consumerThread to consume, sharedQueue's size= 2
Consuming value 4
Consuming value 5
currenlty queue is empty
produce 6
Consuming value 6
currenlty queue is empty
produce 7
produce 8
Queue is full, producerThread is waiting for consumerThread to consume, sharedQueue's size= 2
Consuming value 7
Consuming value 8
currenlty queue is empty
produce 9
Consuming value 9
currenlty queue is empty
*/