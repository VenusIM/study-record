package ch02.item02.bulider_pattern.interface_builder;

public class Jwt {

    private String userIdx;
    private String userId;
    private String userNm;

    private String userType;
    private String frIdx;
    private String parId;
    private String parHp;
    private String status;
    private String loginUiType;
    private Boolean checkPwd;

    public Jwt(String userIdx, String userId, String userNm, String userType, String frIdx,
               String parId, String parHp, String status, String loginUiType, Boolean checkPwd) {
        this.userIdx = userIdx;
        this.userId = userId;
        this.userNm = userNm;
        this.userType = userType;
        this.frIdx = frIdx;
        this.parId = parId;
        this.parHp = parHp;
        this.status = status;
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
