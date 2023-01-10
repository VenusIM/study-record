package ch02.item06.regular_expression;

import java.util.regex.Pattern;

public class Regexp {

    // 이메일 정규 표현식
    private final Pattern emailPattern = Pattern.compile("^([\\w\\.\\_\\-])*[a-zA-Z0-9]+([\\w\\.\\_\\-])*([a-zA-Z0-9])+([\\w\\.\\_\\-])+@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]{2,8}$");

    public void compileOnCall(String email) {
        long startTime = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            email.matches("^([\\w\\.\\_\\-])*[a-zA-Z0-9]+([\\w\\.\\_\\-])*([a-zA-Z0-9])+([\\w\\.\\_\\-])+@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]{2,8}$");
        }
        System.out.println("Compile On Call     >> " + (System.nanoTime() - startTime));
    }

    public void compileBeforeCall(String email) {
        long startTime = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            emailPattern.matcher(email).matches();
        }
        System.out.println("Compile Before Call >> " + (System.nanoTime() - startTime));
    }

}
