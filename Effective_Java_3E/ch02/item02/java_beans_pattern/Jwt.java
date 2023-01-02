package ch02.item02.java_beans_pattern;

/**
 * 자바 빈즈 패턴 (Java Beans Pattern)
 */
public class Jwt {

    private static final String SECRET_KEY = "1234"; // JWT Secret Key

    private String userIdx;
    private String frIdx;
    private String userId;
    private String parId;
    private String userNm;
    private String parHp;
    private String status;
    private String userType;
    private String loginUiType;
    private Boolean checkPwd;

    public void setUserIdx(String userIdx) {
        this.userIdx = userIdx;
    }

    public void setFrIdx(String frIdx) {
        this.frIdx = frIdx;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setParId(String parId) {
        this.parId = parId;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public void setParHp(String parHp) {
        this.parHp = parHp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setLoginUiType(String loginUiType) {
        this.loginUiType = loginUiType;
    }

    public void setCheckPwd(Boolean checkPwd) {
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