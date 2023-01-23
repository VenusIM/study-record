package ch02.item06.lazy_initialization;

public class ClassA {

    private ClassB classB;

    public ClassA() {
        this.classB = new ClassB();
    }
}
