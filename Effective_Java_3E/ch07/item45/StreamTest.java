package ch07.item45;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {


    private static final List<Person> list = Arrays.asList(
            new Person("권도윤", 4, "MALE"),
            new Person("박송화", 3, "FEMALE"),
            new Person("유희주", 2, "FEMALE"),
            new Person("임준희", 1, "MALE")
    );

    /**
     * 내/외부 반복자 테스트 메서드
     */
    static void iterator() {
        List<String> list = Arrays.asList("권도윤","박송화","유희주","임준희");

        // 외부 반복자 : 개발자 코드에서 처리 (while)
        Iterator<String> iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());

        // 내부 반복자 1
        iterator = list.iterator();
        iterator.forEachRemaining(System.out::println);

        // 내부 반복자 2
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.close();

        // BaseStream AutoClosable 구현 ==> try with resources 사용가능
        try(Stream<String> stream1 = list.stream()) {
            stream1.forEach(System.out::println);
        }
    }

    // 순차, 병렬 데이터 처리
    static void seriesAndParallel() {

        // 순차 처리 스트림
        Stream<Person> series = list.stream();
        series.forEach(StreamTest::print);

        System.out.println("================");

        // 병렬 처리 스트림
        Stream<Person> parallel = list.parallelStream();
        parallel.forEach(StreamTest::print);
    }

    static void print(Person person) {
        System.out.println("Thread >> "+Thread.currentThread().getName());
        System.out.println("person >> " + person);
    }

    static void pipeLine() {

        /**
         * 남자의 나이 평균
         * 중간 연산 과정은 모두 Stream return
         */
        double avg = list.stream()                                      // 오리지널 스트림
                .filter(person -> person.getSex() == Person.Sex.MALE)   // 중간 연산 (필터링 처리 중간 스트림)
                .mapToInt(Person::getAge)                               // 중간 연산 (매핑 처리 중간 스트림)
                .average()                                              // 종단 연산 (집계 처리 결과물)
                .getAsDouble();                                         // 결과물

        System.out.println(avg);
    }

    static void recycleStream() {
        try (IntStream intStream = IntStream.of(1, 3, 5, 7)) {
            intStream.forEach(System.out::println);
            intStream.forEach(System.out::println); // IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }

    static void infiniteStream() {

        // 무한 스트림
        Stream.iterate(0, i -> (i+1)%2)
                .distinct()                     // 0, 1 두개만 존재
                .limit(10)              // 10개에 도달할 수 없음
                .forEach(System.out::println);
        // 정상 동작
        Stream.iterate(0, i -> (i+1)%2)
                .limit(10)              // 10개 도달 가능
                .distinct()                     // 0, 1
                .forEach(System.out::println);
    }

    static void lazy() {
        Arrays.stream(new int[] {7,6,4,3})
                .filter(num -> {
                    System.out.println("filter1 >> "+num);
                    return num < 7;
                })
                .map(num -> {
                    System.out.println("map1 >> "+num);
                    return num % 2;
                }); // Lazy 지연 >> 파이프라인 구성 역할만 함, 종단 연산이 호출 될때 파이프라인 실행


        // Fusion Loop 혼합된 루프 >> 순회연산이 연속되는 경우 히나의 루프로 중간 연산 수행
        Arrays.stream(new int[] {7,6,4,3})
                .filter(num -> {
                    System.out.println("filter2 >> "+num);
                    return num < 7;
                })
                .map(num -> {
                    System.out.println("map2 >> "+num);
                    return num % 2;
                }).findFirst(); // short circuit 끊어진 순회 >> 종단 연산을 보고 수행

    }

    public static void main(String[] args) {

//        iterator();             // 내,외부 반복자 예제

//        seriesAndParallel();    // 순차, 병렬 스트림 테스트

//        pipeLine();             // 스트림 파이프라인 예제

//        lazy();                 // 지연 평가 테스트

//        infiniteStream();       // 무한 스트림

//        recycleStream();        // 재활용 테스트

    }
}
