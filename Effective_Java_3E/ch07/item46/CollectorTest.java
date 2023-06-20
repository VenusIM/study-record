package ch07.item46;

import ch07.item45.Person;

import static ch07.item45.Person.Sex.*;

import java.util.*;
import static java.util.stream.Collectors.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class CollectorTest {

    private static final List<String> given = Arrays.asList("dd", "aa", "cc", "bb", "aa");

    static void set() {

        System.out.println("========= toSet() =========");

        Map<String, Set<String>> result = given.stream()
                .collect(groupingBy(String::toUpperCase, toSet()));
        result.values().stream().forEach(System.out::println);

        System.out.println("========= toSet() =========");

    }

    static void collection() {

        System.out.println("========= toCollection() =========");

        TreeMap<String, Set<String>> result = given.stream()
                .sorted()
                .collect(groupingBy(String::toLowerCase, TreeMap::new, toCollection(TreeSet::new))
                );

        result.values().forEach(System.out::println);

        System.out.println("========= toCollection() =========");

    }

    static void concurrent() {

        System.out.println("========= concurrent() =========");

        ConcurrentHashMap<String, Set<String>> result1 = given.stream()
                .collect(groupingBy(String::toLowerCase, ConcurrentHashMap::new, toCollection(TreeSet::new)));

        ConcurrentMap<String, HashSet<String>> result2 = given.stream()
                .collect(groupingByConcurrent(s -> s, toCollection(HashSet::new)));

        System.out.println("========= concurrent() =========");

    }

    static void partitioningby() {

        System.out.println("========= partitioningby() =========");

        Map<Boolean, List> result = given.stream()
                .collect(partitioningBy(s -> s.length() < 2, toCollection(LinkedList::new)));

        System.out.println("========= partitioningby() =========");

    }

    static void summing() {

        System.out.println("========= summing() =========");

        Double result1 = given.stream()
                        .collect(summingDouble(String::length));

        Double result2 = given.stream()
                .mapToDouble(String::length)
                .reduce(0D,Double::sum);

        System.out.println(result1.doubleValue() == result2.doubleValue());

        System.out.println("========= summing() =========");

    }

    static void averaging() {

        System.out.println("========= averaging() =========");

        Double result1 = given.stream()
                .collect(averagingDouble(String::length));

        Double result2 = given.stream()
                .mapToDouble(String::length)
                .average()
                .getAsDouble();

        System.out.println(result1.doubleValue() == result2.doubleValue());

        System.out.println("========= averaging() =========");

    }

    static void summarizing() {

        System.out.println("========= summarizing() =========");

        DoubleSummaryStatistics result1 = given.stream()
                .collect(summarizingDouble(String::length));

        DoubleSummaryStatistics result2 = given.stream()
                .mapToDouble(String::length)
                .summaryStatistics();

        System.out.println("average >> " + (result1.getAverage() == result2.getAverage()));
        System.out.println("count >> " + (result1.getCount() == result2.getCount()));
        System.out.println("max >> " + (result1.getMax() == result2.getMax()));
        System.out.println("min >> " + (result1.getMin() == result2.getMin()));
        System.out.println("sum >> " + (result1.getSum() == result2.getSum()));

        System.out.println("========= summarizing() =========");

    }

    static void joiningg() {

        System.out.println("========= joining() =========");

        String result = given.stream().collect(joining("&", "PREFIX-", "-SUFFIX"));
        System.out.println("result : "+result +", equals : "+result.equals("PREFIX-dd&aa&cc&bb&aa-SUFFIX"));

        System.out.println("========= joining() =========");

    }

    public static void main(String[] args) {
        BinaryOperator binaryOperator; // >> BiFunction extends
        set();
        collection();
        concurrent();
        partitioningby();
        summing();
        averaging();
        summarizing();
        joiningg();
    }
}
