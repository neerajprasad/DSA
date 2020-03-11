package thread.custom;

public class CustomThreadSemaphore {
    static  int sharedValue;

    public static void main(String[] args) {
        MySemaphore mySemaphore = new MySemaphore(1);
    IncrementThread incrementThread =  new IncrementThread(mySemaphore);
    DecrementThread decrementThread =  new DecrementThread(mySemaphore);
    new Thread(incrementThread).start();
    new Thread(decrementThread).start();
    }
}
