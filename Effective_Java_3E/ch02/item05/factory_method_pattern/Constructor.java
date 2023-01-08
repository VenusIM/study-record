package ch02.item05.factory_method_pattern;

import java.util.function.Supplier;

public interface Constructor {
    Product createProduct(Supplier<Product> productSupplier);
}
