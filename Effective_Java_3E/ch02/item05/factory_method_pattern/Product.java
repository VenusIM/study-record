package ch02.item05.factory_method_pattern;

public interface Product {

    default void whenProductConstructorCall() {
        System.out.println("========================");
    }

    void info();

    void usage();
}
