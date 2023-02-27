package ch04.item15.top_level;

import java.util.ArrayList;
import java.util.List;

public class MemoryTest {
    public static void main(String[] args) {

        Runtime.getRuntime().gc();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("totalMemory >> "+totalMemory);

        // >> Memory used 33979352
        List<PrivateNestedClass> list1 = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            list1.add(new PrivateNestedClass());
        }


        // >> Memory used 33976856
        /*List<PrivateStaticNestedClass> list1 = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            list1.add(new PrivateStaticNestedClass());
        }*/

        System.out.println("used >>"+ (totalMemory - Runtime.getRuntime().freeMemory()));

    }
}
