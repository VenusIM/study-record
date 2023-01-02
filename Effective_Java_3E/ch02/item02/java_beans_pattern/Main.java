package ch02.item02.java_beans_pattern;

public class Main {
    public static void main(String[] args) {
        Jwt jwt = new Jwt();
        jwt.setUserIdx("1");
        jwt.setUserId("junhee0205");
        jwt.setUserNm("junhee");
        System.out.println(jwt);

        jwt.setUserType("USER");
        System.out.println(jwt);
    }
}
