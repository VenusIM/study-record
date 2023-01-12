package ch02.item06.lazy_initialization;

import java.util.Objects;

public class ClassA {

    private ClassB classB;

    public ClassA() {
        this.classB = new ClassB();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassA classA = (ClassA) o;
        return Objects.equals(classB, classA.classB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classB);
    }
}
