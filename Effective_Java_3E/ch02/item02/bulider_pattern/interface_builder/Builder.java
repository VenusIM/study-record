package ch02.item02.bulider_pattern.interface_builder;


public interface Builder {

    Builder requiredInfo(String userIdx, String userId, String userNm);

    Builder userType(String userType);

    Builder frIdx(String frIdx);

    Builder parId(String parId);

    Builder parHp(String parHp);

    Builder status(String status);

    Builder loginUiType(String loginUiType);

    Builder checkPwd(Boolean checkPwd);

    Jwt build();
}
