package ch02.item01.code.장점2;

public class Pros2 {
    private static Pros2 pros2 = null;

    private Pros2() {}

    static Pros2 getInstance() {
        if(pros2 == null) {
            pros2 = new Pros2();
        }
        return pros2;
    }
}
