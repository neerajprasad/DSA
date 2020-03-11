package thread.generic;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    private  static int nthread = 2;
    private  static int nTask = 10;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(nthread);
        System.out.println("executor serive is create for n thread :"+nthread);
        for (int i = 0; i <nTask ; i++) {
            MyRunnable myRunnable = new MyRunnable(i);
            executor.execute(myRunnable);
        }

        executor.shutdown();
        System.out.println("executor are shutdown");
    }
}

class MyRunnable implements Runnable{
private int taskNumber;

    public MyRunnable(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " executing task number "+ taskNumber);
    }
}
