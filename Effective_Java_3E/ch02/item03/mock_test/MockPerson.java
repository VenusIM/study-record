package ch02.item03.mock_test;

public class MockPerson implements Person {
    @Override
    public void move() {
        System.out.println("MockPerson is moving");
    }

    @Override
    public void run() {
        System.out.println("MockPerson is running");
    }
}
