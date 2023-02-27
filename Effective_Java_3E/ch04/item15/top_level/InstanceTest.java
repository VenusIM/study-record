package ch04.item15.top_level;

/**
 * static class니까 한번 생성되는 것인가?
 */
public class InstanceTest {
    public static void main(String[] args) {

        PrivateNestedClass privateNestedClass = new PrivateNestedClass();
        PrivateNestedClass.PublicInnerClass publicInnerClass1 = privateNestedClass.new PublicInnerClass();
        PrivateNestedClass.PublicInnerClass publicInnerClass2 = privateNestedClass.new PublicInnerClass();
        System.out.println(publicInnerClass1.equals(publicInnerClass2));


        PrivateStaticNestedClass.TestInnerClass test1 = new PrivateStaticNestedClass.TestInnerClass();
        PrivateStaticNestedClass.TestInnerClass test2 = new PrivateStaticNestedClass.TestInnerClass();

        System.out.println(test1.equals(test2));
    }
}
