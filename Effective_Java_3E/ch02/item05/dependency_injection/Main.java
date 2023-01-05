package ch02.item05.dependency_injection;

public class Main {
    public static void main(String[] args) {
        // 자원을 직접 명시하지 않고 의존성을 주입해 준다.
        Car car = new Car(new Boy("Steven"), new Boy("King"), new Boy("Boy"), new Girl("Jenny"), new Girl("Pretty"));
        car.ride(new Boy("B"), new Girl("G"));
        car.leave(new Boy("B"), new Girl("G"));
    }
}
