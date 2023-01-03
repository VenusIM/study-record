package ch02.item03.static_factory_method_type;

/**
 * 정적 펙터리의 메서드 참조를 공급자로 사용할 수 있다.
 */
public class Supplier {

    public void StartAllBehavior(java.util.function.Supplier<Person> personSupplier) {
        Person person = personSupplier.get();
        person.move();
        person.run();
    }

}
