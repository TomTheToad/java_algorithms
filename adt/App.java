package adt;

public class App {

    public static void main(String[] args) {
        Counter counter1 = new Counter("counter1");
        counter1.increment();
        System.out.println(counter1.toString());
    }
}
