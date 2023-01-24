package ch02.item07.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        Map<Integer, Stack<String>> weakMap = new WeakHashMap<>();

        Integer key1 = 999;
        Integer key2 = 9999;

        Stack<String> stack1 = new Stack<>();
        stack1.add("999");

        Stack<String> stack2 = new Stack<>();
        stack2.add("9999");

        weakMap.put(key1, stack1);
        weakMap.put(key2, stack2);

       /* Map<Integer, Stack<String>> hashMap = new HashMap<>();
        hashMap.put(key1, stack1);
        hashMap.put(key2, stack2);*/

//        key1 = null;
        stack1 = null;

        System.gc();

        weakMap.entrySet().forEach(e -> System.out.println("weakMap >> " + e));
        
        // 다른 참조가 있을 경우 GC의 영향을 받지 않음
//        hashMap.entrySet().forEach(e -> System.out.println("hashMap >> " + e));

        System.out.println(stack1);
    }
}
