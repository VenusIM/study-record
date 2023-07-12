package ch08.item49;

public class AssertKeyword {
    public static void main(String[] args) {
        try {
            assertLengthCheckMethod(3 , 1,2);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    private static void assertLengthCheckMethod(int length, int ... a) {
        assert a != null;
        assert a.length == length;
    }
}
