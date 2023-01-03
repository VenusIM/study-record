package ch02.item03.static_factory_method_type;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.move();
        person.run();
    }

}
