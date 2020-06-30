package multithreading;

public class Main {
    public static void main(String[] args) {
        var counter = new Counter();
        counter.setLimit(100);

        var firstThread = new FirstThread(counter);
        firstThread.start();

        var runnable = new SecondThread(counter);
        var secondThread = new Thread(runnable);
        secondThread.start();
    }
}
