package multithreading;

import org.apache.log4j.Logger;

public class SecondThread implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(SecondThread.class);
    private final Counter counter;

    public SecondThread(Counter counter) {
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
