package ch02.item05.dependency_injection;

public class Boy implements Person{

    private final String name;
    public Boy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
