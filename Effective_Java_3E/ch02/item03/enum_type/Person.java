package ch02.item03.enum_type;

/**
 * Enum 을 통한 싱글턴 생성시 리플렉션을 통한 예외를 방지할 수 있다.
 */
public enum Person {
    INSTANCE;

    public void move() {
        System.out.println("Person is moving");
    }

    public void run() {
        System.out.println("Person is running");
    }
}
