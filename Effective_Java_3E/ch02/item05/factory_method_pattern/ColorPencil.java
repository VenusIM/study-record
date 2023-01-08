package ch02.item05.factory_method_pattern;

public class ColorPencil extends Pencil {
    @Override
    public void info() {
        super.info();
        System.out.println("필기구 중 색연필입니다.");
    }
}
