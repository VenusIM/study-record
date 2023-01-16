package ch02.item07.map.linkedhashmap;

import java.util.Map;

public class LinkedHashMap extends java.util.LinkedHashMap {
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() == 10 ? true : false;
    }
}
