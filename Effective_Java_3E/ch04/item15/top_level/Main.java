package ch04.item15.top_level;

public class Main {
    public static void main(String[] args) {
        PrivateNestedClass privateNestedClass = new PrivateNestedClass();
        privateNestedClass.info();

        PrivateStaticNestedClass privateStaticNestedClass = new PrivateStaticNestedClass();
        privateStaticNestedClass.info();
    }
}
