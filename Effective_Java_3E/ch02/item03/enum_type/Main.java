package ch02.item03.enum_type;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Person person = Person.INSTANCE;
        person.move();
        person.run();

        // Enum 을 통한 싱글턴 생성시 리플렉션을 통한 예외를 방지할 수 있다.
        try {
            Constructor<Person> constructor = Person.class.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            System.out.println(e.getCause() + " " + e.getMessage());
        }
    }
}
