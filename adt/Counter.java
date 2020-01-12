package adt;

public class Counter {
    private String name = "counter";
    private int count = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" + "name='" + name + '\'' + ", count=" + count + '}';
    }
}