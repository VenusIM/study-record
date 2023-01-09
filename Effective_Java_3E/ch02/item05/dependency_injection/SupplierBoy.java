package ch02.item05.dependency_injection;

public class SupplierBoy implements Person {

    private final String name = "supplier boy";

    @Override
    public String getName() {
        return name;
    }
}
