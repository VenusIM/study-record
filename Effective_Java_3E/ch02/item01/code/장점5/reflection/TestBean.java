package ch02.item01.code.장점5.reflection;

public class TestBean {
    private String privateField1 = "1번 private field";
    private String privateField2 = "2번 private field";
    private String privateField3 = "3번 private field";

    private TestBean() {}

    private void privateInfo() {
        System.out.println("private 접근제어자를 가지고 있습니다.");
    }
}
