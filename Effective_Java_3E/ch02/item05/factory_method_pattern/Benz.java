package ch02.item05.factory_method_pattern;

public class Benz extends Car {
    @Override
    public void info() {
        super.info();
        System.out.println("자동차 중 벤츠입니다.");
    }
}
