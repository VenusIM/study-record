package ch02.item03.static_factory_method_type;

/**
 * 제네릭 싱글턴 팩터리를 통해 클라이언트에서 원하는 타입으로 동적으로 사용할 수 있다.
 * @param <T> - Type
 */
public class GenericSingletonFactory<T> {

    private static final GenericSingletonFactory<Object> INSTANCE = new GenericSingletonFactory<>();

    private GenericSingletonFactory() {}

    public static <E> GenericSingletonFactory<E> getInstance() {
        return (GenericSingletonFactory<E>) INSTANCE;
    }

    public void typing(T t) {
        System.out.println("Typing "+t.getClass()+" "+t);
    }

}
