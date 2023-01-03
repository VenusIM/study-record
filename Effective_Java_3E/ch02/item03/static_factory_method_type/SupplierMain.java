package ch02.item03.static_factory_method_type;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier supplier = new Supplier();

        // Method Reference로 사용할 수 있다.
        supplier.StartAllBehavior(Person::getInstance);
    }
}
