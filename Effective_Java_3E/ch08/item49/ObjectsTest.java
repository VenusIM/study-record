package ch08.item49;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * java.util.Objects Method 테스트 클래스이다.
 */
public class ObjectsTest {
    public static void main(String[] args) {

//        Objects.requireNonNull(null);

        /**
         * exception message 를 customize 할수 있다.
         */
//        Objects.requireNonNull(null, "Objects.requireNonNull Test");


        /**
         * Supplier Interface 를 인자로 받는 메서드
         */
//        Objects.requireNonNull(null, () -> {
//            String s = "It's Null";
//            return s;
//        });

        /**
         *  Supplier 의 지연 연산의 이점
         */
//        Objects.requireNonNull(null, new LazySupplier());

        /**
         * 대상 및 supplier 모두 null check 지원 메소드
         */
        Objects.requireNonNullElseGet("", new LazySupplier());
        System.out.println(Objects.requireNonNullElseGet(null, new LazySupplier()));
        Objects.requireNonNullElseGet(null, (Supplier<String>) () -> null);

        /**
         * index 음수, 길이 체크
         */
//        Objects.checkIndex(1,0);

        /**
         * index 음수, 범위, 길이 체크
         */
        Objects.checkFromToIndex(1,3,2);
        Objects.checkFromIndexSize(2,2,3);
    }

    private static class LazySupplier implements Supplier {
        @Override
        public Object get() {
            Long start = System.currentTimeMillis();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "This method took " + (System.currentTimeMillis() - start) / 1000 + " Seconds and It's Null";
        }
    }
}
