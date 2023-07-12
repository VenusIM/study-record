package ch07.item47;

import java.util.*;

public class ForeachTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        /* Iterable 를 상속받지 않아 for-each 불가
        for(Integer num : stream);
        */

        // Iterable 를 상속받은 Collection Interface 를 상속받음
        Queue<String> queue = new LinkedList<>();
        for (String str : queue) ;

        List<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list3 = (ArrayList<String>) list2;

        Iterator<Integer> integerIterator = Collections.emptyIterator();
        Iterable<Integer> iterable2 = toIterable(integerIterator);

        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);
        Set<Integer> set2 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

        Collection<Set<Integer>> collection1 = of(set1);
        AbstractList<Set<Integer>> collection2 = (AbstractList<Set<Integer>>) of(set2);

        for (int i = 0; i < 30; i++) {
            System.out.println("result"+i+" : "+collection2.get(i));
        }


    }

    public static <T> Iterable<T> toIterable(Iterator<T> iterator) {
        /*
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return iterator;
            }
        };
        */
        return () -> iterator;
    }

    static final <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
        if (src.size() > 30) {
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MAX_VALUE == Math.pow(2, 31) - 1);
        }

            return new AbstractList<>() {
                @Override
                public Set<E> get(int index) {
                    Set<E> result = new HashSet<>();
                    System.out.println("index : " + index);
                    for (int i = 0; index != 0; i++, index = index >> i) {
                        if ((index & 1) == 1) {
                            System.out.println(index + " & " + i);
                            result.add(src.get(i));
                        }
                    }
                    return result;
                }

                @Override
                public boolean contains(Object o) {
                    return o instanceof Set && src.containsAll((Set) o);
                }

                @Override
                public int size() {
                    int num = 1 << src.size();
                    System.out.println(num);
                    return num;
                }
            };
        }
    }

