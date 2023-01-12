package ch02.item06.auto_boxing;

public class Wrapper {
    private Byte byteValue = 0;
    private Short shortValue = 0;
    private Integer intValue = 0;
    private Long longValue = 0L;

    public void sumLongValue() {
        Long startTime = System.nanoTime();
        for(long i = 0; i < 100000; i++) {
            longValue += i;
        }
        System.out.println("Wrapper Class Long >> " + (System.nanoTime() - startTime));
    }
}
