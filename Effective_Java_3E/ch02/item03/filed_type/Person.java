package ch02.item03.filed_type;

public class Person {
    public static final Person INSTANCE = new Person();

    private Person() {}

    public void move() {
        System.out.println("Person is moving.");
    }

    public void run() {
        System.out.println("Person is running.");
    }
}
