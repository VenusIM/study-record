package ch02.item03.static_factory_method_type;

public class Person {
    private static final Person INSTANCE = new Person();

    private Person() {}

    public static Person getInstance() {
        return INSTANCE;
        /*
        * 장점1 클라이언트 코드를 바꾸지 않고 싱글턴 커스터마이징 가능
        * return new Person();
        */
    }

    public void move() {
        System.out.println("Person is moving.");
    }

    public void run() {
        System.out.println("Person is running.");
    }
}
