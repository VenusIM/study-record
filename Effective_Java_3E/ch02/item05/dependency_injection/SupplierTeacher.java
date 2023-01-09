package ch02.item05.dependency_injection;

public class SupplierTeacher implements Person {

    private final String name = "supplier teacher";

    @Override
    public String getName() {
        return name;
    }
}
