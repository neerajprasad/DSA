package thread.custom;

public class MySemaphore {
    private int permits;

    public MySemaphore(int permits) {

        this.permits = permits;
    }
    public synchronized void  acquire() throws InterruptedException {
        if(permits>0){
            permits--;
        }else {
            this.wait();
            permits--;
        }

    }
    protected synchronized void  release() throws InterruptedException {
        permits++;
        if(permits>0){
            this.notify();
        }
    }
}
