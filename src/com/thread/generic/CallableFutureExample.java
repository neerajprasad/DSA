package thread.generic;

import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> integerFuture = executorService.submit(new SumIntegerCallable(4));
        Future<Double> doubleFuture = executorService.submit(new DoubleSquare(4));
        System.out.println(integerFuture.get());
        System.out.println(doubleFuture.get());
        executorService.shutdown();
    }
}

class SumIntegerCallable implements Callable<Integer> {
    int value;

    public SumIntegerCallable(int value) {
        this.value = value;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 01; i <=value ; i++) {
            sum +=i;
        }
        return sum;
    }
}

class DoubleSquare implements Callable<Double> {
    double value;

    public DoubleSquare(double value) {
        this.value = value;
    }

    @Override
    public Double call() throws Exception {
        return value*value;
    }
}