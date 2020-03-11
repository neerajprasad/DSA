package thread.custom;

public class DecrementThread implements Runnable {
    MySemaphore mySemaphore;

    public DecrementThread(MySemaphore mySemaphore) {
        this.mySemaphore = mySemaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is waiting  to acquire permit");
        try {
            mySemaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "  acquire permit");
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " > " + CustomThreadSemaphore.sharedValue--);
            }

            System.out.println(Thread.currentThread().getName() +
                    " has released permit");
            mySemaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
