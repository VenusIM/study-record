package ch02.item06.adapter_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        Set<String> setAdapterA = map.keySet();
        Set<String> setAdapterB = map.keySet();

        System.out.println(setAdapterA.equals(setAdapterB));


    }
}
