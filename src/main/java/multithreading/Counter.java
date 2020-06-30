package multithreading;

public class Counter {
    private int count;
    private int limit;

    public int getCount() {
        return count;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void increment() {
        count++;
    }
}
