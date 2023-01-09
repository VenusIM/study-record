package ch02.item05.dependency_injection;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierCar {

    private final Supplier<Person>[] people;

    public SupplierCar(Supplier<Person> ... people) {
        System.out.println("======================================================");
        this.people = people;
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.get().getName() + "이/가 탑승했습니다.");
        });
    }

    public void ride(Supplier<Person> ... people) {
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.get().getName() + "이/가 탑승했습니다.");
        });
    }

    public void leave(Supplier<Person> ... people) {
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.get().getName() + "이/가 내렸습니다.");
        });
    }
}
