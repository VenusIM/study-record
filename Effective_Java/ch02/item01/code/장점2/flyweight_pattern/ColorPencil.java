package ch02.item01.code.장점2.flyweight_pattern;

/**
 *  길이와 무게 등은 고정값이라고 가정하고 진행한다.
 *  색만 변경한다.
 */
public class ColorPencil {

    private String color;
    private final int width = 15; // 15cm
    private final int weight = 10; // 10g

    public ColorPencil(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println(color + "의 연필이 꺼내졌습니다.");
    }
}
