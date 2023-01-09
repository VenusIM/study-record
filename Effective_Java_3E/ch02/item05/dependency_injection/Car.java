package ch02.item05.dependency_injection;

import java.util.Arrays;

public class Car {

    private final Person[] people;

    public Car(Person ... people) {
        System.out.println("======================================================");
        this.people = people;
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.getName() + "이/가 탑승했습니다.");
        });
    }

    public void ride(Person ... people) {
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.getName() + "이/가 탑승했습니다.");
        });
    }

    public void leave(Person ... people) {
        Arrays.stream(people).forEach(p -> {
            System.out.println(p.getName() + "이/가 내렸습니다.");
        });
    }
}
