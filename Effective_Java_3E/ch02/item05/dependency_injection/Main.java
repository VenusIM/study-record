package ch02.item05.dependency_injection;

public class Main {
    public static void main(String[] args) {
        // 가변 인자를 통한 예제
        Car car = new Car(new Boy("Steven"), new Boy("King"), new Boy("Boy"), new Girl("Jenny"), new Girl("Pretty"));
        car.ride(new Boy("B"), new Girl("G"));
        car.leave(new Boy("B"), new Girl("G"));

        // Supplier 예제
        SupplierCar supplierCar = new SupplierCar(SupplierBoy::new, SupplierGirl::new);
        supplierCar.ride(SupplierTeacher::new);
        supplierCar.leave(SupplierBoy::new, SupplierTeacher::new);

    }
}
