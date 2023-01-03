package ch02.item03.static_factory_method_type;

public class GSFMain {
    public static void main(String[] args) {
        GenericSingletonFactory<String> stringSingletonFactory = GenericSingletonFactory.getInstance();
        GenericSingletonFactory<Boolean> booleanSingletonFactory = GenericSingletonFactory.getInstance();

        System.out.println(stringSingletonFactory.equals(booleanSingletonFactory));
        stringSingletonFactory.typing("false");
        booleanSingletonFactory.typing(false);
    }
}
