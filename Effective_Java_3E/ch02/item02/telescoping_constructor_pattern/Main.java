package ch02.item02.telescoping_constructor_pattern;

public class Main {
    public static void main(String[] args) {
        Jwt jwt = new Jwt("1", "junhee0205", "junhee");
        System.out.println(jwt);
        jwt = new Jwt("1", "junhee0205", "junhee", "USER");
        System.out.println(jwt);
    }
}
