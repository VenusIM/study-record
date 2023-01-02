package ch02.item02.bulider_pattern.before;

public class Main {
    public static void main(String[] args) {

        Jwt jwt = new Jwt.JwtBuilder("1", "junhee0205", "junhee")
                        .userType("USER")
                        .build();
        System.out.println(jwt);

        jwt = new Jwt.JwtBuilder("1", "junhee0205", "junhee")
                    .userType("USER")
                    .frIdx("123")
                    .loginUiType("DEVICE")
                    .parHp("010-1234-5678")
                    .build();

        System.out.println(jwt);
    }
}
