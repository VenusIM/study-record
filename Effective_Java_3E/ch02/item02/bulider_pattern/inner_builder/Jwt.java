package ch02.item02.bulider_pattern.inner_builder;

/**
 * 빌더 패턴 (Builder Pattern)
 * 직접 코드로 작성하지 않은 Lombok Annotation을 활용하면 자유롭게 커스텀하기 힘들다.
 * ex) 필수 값을 만들 수 없다. 제공하는 방식으로만 구성 가능하다.
 */
public class Jwt {
    
    private static JwtBuilder jwtBuilder;
    private static final String SECRET_KEY = "1234"; // JWT Secret Key
    private final String userIdx;
    private final String userId;
    private final String userNm;
    private final String userType;
    private final String frIdx;
    private final String parId;
    private final String parHp;
    private final String status;
    private final String loginUiType;
    private final Boolean checkPwd;

    private Jwt(JwtBuilder jwtBuilder) {
        this.userIdx = jwtBuilder.userIdx;
        this.userId = jwtBuilder.userId;
        this.userNm = jwtBuilder.userNm;
        this.userType = jwtBuilder.userType;
        this.frIdx = jwtBuilder.frIdx;
        this.parId = jwtBuilder.parId;
        this.parHp = jwtBuilder.parHp;
        this.status = jwtBuilder.status;
        this.loginUiType = jwtBuilder.loginUiType;
        this.checkPwd = jwtBuilder.checkPwd;
    }
    
    public static JwtBuilder builder(String userIdx, String userId, String userNm) {
        if(jwtBuilder != null) {
            return jwtBuilder;
        }
        return new JwtBuilder(userIdx, userId, userNm);
    }

    @Override
    public String toString() {
        return "Jwt{" +
                "userIdx='" + userIdx + '\'' +
                ", userId='" + userId + '\'' +
                ", userNm='" + userNm + '\'' +
                ", userType='" + userType + '\'' +
                ", frIdx='" + frIdx + '\'' +
                ", parId='" + parId + '\'' +
                ", parHp='" + parHp + '\'' +
                ", status='" + status + '\'' +
                ", loginUiType='" + loginUiType + '\'' +
                ", checkPwd=" + checkPwd +
                '}';
    }

    public static class JwtBuilder {

        private final String userIdx;
        private final String userId;
        private final String userNm;

        private String userType;
        private String frIdx;
        private String parId;
        private String parHp;
        private String status;
        private String loginUiType;
        private Boolean checkPwd;


        public JwtBuilder(String userIdx, String userId, String userNm) {
            this.userIdx = userIdx;
            this.userId = userId;
            this.userNm = userNm;
        }

        public JwtBuilder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public JwtBuilder frIdx(String frIdx) {
            this.frIdx = frIdx;
            return this;
        }

        public JwtBuilder parId(String parId) {
            this.parId = parId;
            return this;
        }

        public JwtBuilder parHp(String parHp) {
            this.parHp = parHp;
            return this;
        }

        public JwtBuilder status(String status) {
            this.status = status;
            return this;
        }

        public JwtBuilder loginUiType(String loginUiType) {
            this.loginUiType = loginUiType;
            return this;
        }

        public JwtBuilder checkPwd(Boolean checkPwd) {
            this.checkPwd = checkPwd;
            return this;
        }

        public Jwt build() {
            return new Jwt(this);
        }
    }
}
