package ch02.item05.factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new ConcreteCreator();

        Product bmw = constructor.createProduct(Bmw::new);
        bmw.info();
        bmw.usage();

        Product benz = constructor.createProduct(Benz::new);
        benz.info();
        benz.usage();

        Product colorPencil = constructor.createProduct(ColorPencil::new);
        colorPencil.info();
        colorPencil.usage();
    }
}
