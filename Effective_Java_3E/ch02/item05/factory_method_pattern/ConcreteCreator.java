package ch02.item05.factory_method_pattern;

import java.util.function.Supplier;

public class ConcreteCreator implements Constructor {

    @Override
    public Product createProduct(Supplier<Product> productSupplier) {
        return productSupplier.get();
    }
}
