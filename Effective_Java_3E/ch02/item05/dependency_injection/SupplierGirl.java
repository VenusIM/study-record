package ch02.item05.dependency_injection;

public class SupplierGirl implements Person {

    private final String name = "supplier girl";

    @Override
    public String getName() {
        return name;
    }
}