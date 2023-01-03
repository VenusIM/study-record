package ch02.item02.bulider_pattern.interface_builder;

public class Main {

    private Builder builder;

    public static void main(String[] args) {
        Builder builder = new JwtBuilder();
        Jwt jwt = builder
                    .requiredInfo("1", "junhee0205", "junhee")
                    .frIdx("2")
                    .loginUiType("USER")
                    .checkPwd(false)
                    .build();
        System.out.println(jwt);
    }
}
