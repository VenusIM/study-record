package ch02.item05.dependency_injection;

public class Girl implements Person{
    private final String name;

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
