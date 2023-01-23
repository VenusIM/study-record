package ch02.item06.auto_boxing;

public class Primitive {
    private long longValue = 0L;

    public void sumLongValue() {
        long startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            longValue++;
        }
        System.out.println("Primitive type add int  >> " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for(long i = 0; i < 100000; i++) {
            longValue += i;
        }
        System.out.println("Primitive type add long >> " + (System.nanoTime() - startTime));
    }
}
