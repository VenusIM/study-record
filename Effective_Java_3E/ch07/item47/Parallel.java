package ch07.item47;

import java.math.BigInteger;
import java.util.SplittableRandom;
import java.util.stream.LongStream;

public class Parallel {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        pi(1000000);
        System.out.println("pi = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        enhancedPi(1000000);
        System.out.println("enhancedPi = " + (System.currentTimeMillis() - startTime));
    }

    static long pi (long n) {
        return LongStream.rangeClosed(2, n) // 1제외
                .mapToObj(BigInteger::valueOf)
                .filter(bigInteger -> bigInteger.isProbablePrime(50)) // 소수 확률 certainty 높을 수록 정확도 상승
                .count();
    }

    static long enhancedPi (long n) {
        return LongStream.rangeClosed(2, n) // 1제외
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(bigInteger -> bigInteger.isProbablePrime(50))
                .count();
    }
}
