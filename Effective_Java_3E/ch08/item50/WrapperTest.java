package ch08.item50;

public class WrapperTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest();
        integerTest.getNum();
    }

    private static class IntegerTest {
        private Integer num = 1;

        public Integer getNum() {
            return num;
        }
        @Override
        public String toString() {
            return "IntegerTest{" +
                    "num=" + num +
                    '}';
        }
    }
}
