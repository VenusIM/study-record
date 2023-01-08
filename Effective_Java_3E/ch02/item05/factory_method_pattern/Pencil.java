package ch02.item05.factory_method_pattern;

public abstract class Pencil implements Product {

    public Pencil() {
        whenProductConstructorCall();
    }

    @Override
    public void info() {
        System.out.println("필기구입니다.");
    }

    @Override
    public void usage() {
        System.out.println("작성할때 사용합니다.");
    }
}
