package ch04.item15.access_modifier;

/*
import ch04.item15.access_modifier.test_package.PrivateClass;
import ch04.item15.access_modifier.test_package.ProtectedClass;
import ch04.item15.access_modifier.test_package.DefaultClass;
*/
import ch04.item15.access_modifier.test_package.PublicClass;

public class Main {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        System.out.println(publicClass.info);
/*
        PrivateClass privateClass = new PrivateClass();
        System.out.println(privateClass.info);

        DefaultClass defaultClass = new DefaultClass();
        System.out.println(defaultClass.info);

        ProtectedClass protectedClass = new ProtectedClass();
        System.out.println(protectedClass.info);
*/

    }
}
