package ch02.item06.regular_expression;

public class Main {
    public static void main(String[] args) {
        Regexp regexp = new Regexp();
        // 매번 정규식 컴파일
        regexp.compileOnCall("yim3370@gmail.com");
        // 정규식 초기화 공유
        regexp.compileBeforeCall("yim3370@gmail.com");

    }
}
