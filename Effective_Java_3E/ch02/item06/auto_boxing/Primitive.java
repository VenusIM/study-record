package ch02.item06.auto_boxing;

public class Primitive {
    private byte byteValue = 0;
    private short shortValue = 0;
    private int intValue = 0;
    private long longValue = 0L;

    public void sumLongValue() {
        long startTime = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            longValue++;
        }
        System.out.println("Primitive type long >> " + (System.nanoTime() - startTime));
    }
}
