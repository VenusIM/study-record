package ch02.item03.mock_test;

public class Junhee implements Person {
    public static final Junhee INSTANCE = new Junhee();

    private Junhee() {}

    public void move() {
        System.out.println("Junhee is moving.");
    }

    public void run() {
        System.out.println("Junhee is running.");
    }
}
