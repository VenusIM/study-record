package ch07.item47;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class Casting {
    public static void main(String[] args) {

        // 어떻게 상호 형변환이 가능할까?
        Iterator<String> iterator = Collections.emptyIterator();
        Iterable<String> iterable = (Iterable<String>) iterator;
        Stream<String> stream = (Stream<String>) iterable;

        Iterable<String> abc = Arrays.asList("a","b","c");

        Iterator<String> iteratorFromIterable = iterable.iterator();
        Iterator<String> iteratorFromStream =
                stream.iterator();

        Integer integer = 10;
        double d = (double) Integer.valueOf(1);


    }
}
