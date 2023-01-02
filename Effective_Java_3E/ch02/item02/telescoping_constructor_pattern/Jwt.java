package ch02.item02.telescoping_constructor_pattern;

/**
 * 점층적 생성자 패턴 (Telescoping Constructor Pattern)
 */
public class Jwt {

    private static final String SECRET_KEY = "1234"; // JWT Secret Key

    private final String userIdx;
    private final String frIdx;
    private final String userId;
    private final String parId;
    private final String userNm;
    private final String parHp;
    private final String status;
    private final String userType;
    private final String loginUiType;
    private final Boolean checkPwd;

    //필수 값 생성자
    public Jwt(String userIdx, String userId, String userNm) {
        this(userIdx, userId, userNm, null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType) {
        this(userIdx, userId, userNm, userType, null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx) {
        this(userIdx, userId, userNm, userType, frIdx, null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx, String parId) {
        this(userIdx, userId, userNm, userType, frIdx, parId,null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx, String parId,
               String parHp) {
        this(userIdx, userId, userNm, userType, frIdx, parId, parHp, null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx, String parId,
               String parHp, String status) {
        this(userIdx, userId, userNm, userType, frIdx, parId, parHp, status, null);
    }

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx, String parId,
               String parHp, String status, String loginUiType) {
        this(userIdx, userId, userNm, userType, frIdx, parId, parHp, status, loginUiType, true);
    }

    public Jwt(String userIdx, String userId,  String userNm, String userType, String frIdx, String parId,
               String parHp, String status,  String loginUiType, Boolean checkPwd) {
        this.userIdx = userIdx;
        this.frIdx = frIdx;
        this.userId = userId;
        this.parId = parId;
        this.userNm = userNm;
        this.parHp = parHp;
        this.status = status;
        this.userType = userType;
        this.loginUiType = loginUiType;
        this.checkPwd = checkPwd;
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
}