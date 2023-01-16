package ch02.item07.map.linkedhashmap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap();
        for(int i = 0; i < 20; i++) {
            map.put(i,i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        map.keySet().forEach(k -> stringBuilder.append(k).append(" "));
        System.out.println(stringBuilder);
    }
}
