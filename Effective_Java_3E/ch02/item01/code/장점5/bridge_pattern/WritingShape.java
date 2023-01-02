package ch02.item01.code.장점5.bridge_pattern;


public class WritingShape implements Writing{

    @Override
    public String line() {
        return "로 선을 긋습니다.";
    }

    @Override
    public String circle() {
        return "로 원을 긋습니다.";
    }

    @Override
    public String rectangle() {
        return "로 사각형을 긋습니다.";
    }
}
