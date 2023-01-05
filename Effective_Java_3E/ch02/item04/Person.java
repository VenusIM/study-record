package ch02.item04;

/**
 * 인스턴스화를 막으려거든 private 생성자를 사용하라
 */
public class Person {
    private Person() {
        throw new AssertionError();
    }

    static void info() {
        System.out.println("사람입니다.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.info();
    }
}
