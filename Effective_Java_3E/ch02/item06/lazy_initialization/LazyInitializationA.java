package ch02.item06.lazy_initialization;

public class LazyInitializationA {

    private ClassB classB;

    public ClassB getLazyInitializationB() {
        if(classB == null) {
            this.classB = new ClassB();
        }
        return classB;
    }
}
