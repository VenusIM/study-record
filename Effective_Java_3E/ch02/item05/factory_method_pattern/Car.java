package ch02.item05.factory_method_pattern;

public abstract class Car implements Product {

    public Car() {
        whenProductConstructorCall();
    }

    @Override
    public void info() {
        System.out.println("자동차 입니다.");
    }

    @Override
    public void usage() {
        System.out.println("이동수단 입니다.");
    }
}
