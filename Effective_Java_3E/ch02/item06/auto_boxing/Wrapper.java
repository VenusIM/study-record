package ch02.item06.auto_boxing;

public class Wrapper {
    private Long longValue = 0L;

    public void sumLongValue() {
        Long startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            longValue += i;
        }
        System.out.println("Wrapper Class Long      >> " + (System.nanoTime() - startTime));
    }
}
