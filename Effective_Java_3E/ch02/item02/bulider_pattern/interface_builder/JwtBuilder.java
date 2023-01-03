package ch02.item02.bulider_pattern.interface_builder;

public class JwtBuilder implements Builder {

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

    @Override
    public Builder requiredInfo(String userIdx, String userId, String userNm) {
        this.userIdx = userIdx;
        this.userId = userId;
        this.userNm = userNm;
        return this;
    }

    @Override
    public Builder userType(String userType) {
        this.userType = userType;
        return this;
    }

    @Override
    public Builder frIdx(String frIdx) {
        this.frIdx = frIdx;
        return this;
    }

    @Override
    public Builder parId(String parId) {
        this.parId = parId;
        return this;
    }

    @Override
    public Builder parHp(String parHp) {
        this.parHp = parHp;
        return this;
    }

    @Override
    public Builder status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public Builder loginUiType(String loginUiType) {
        this.loginUiType = loginUiType;
        return this;
    }

    @Override
    public Builder checkPwd(Boolean checkPwd) {
        this.checkPwd = checkPwd;
        return this;
    }

    @Override
    public Jwt build() {
        return new Jwt(userIdx, userId, userNm, userType, frIdx,
                parId, parHp, status, loginUiType, checkPwd);
    }
}
