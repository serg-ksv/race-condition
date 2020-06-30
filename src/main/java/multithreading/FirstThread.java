package multithreading;

import org.apache.log4j.Logger;

public class FirstThread extends Thread {
    private static final Logger LOGGER = Logger.getLogger(FirstThread.class);
    private final Counter counter;

    public FirstThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < counter.getLimit()) {
            counter.increment();
            LOGGER.info(Thread.currentThread().getName() + " value = " + counter.getCount());
        }
    }
}
