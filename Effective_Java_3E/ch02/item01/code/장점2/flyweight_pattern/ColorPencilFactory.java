package ch02.item01.code.장점2.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ColorPencilFactory {

    // 맵 자료구조로 색연필 정보 저장
    public static Map<String, ColorPencil> colorPencilMap = new HashMap<>();

    public static ColorPencil getColorPencil(String color) {
        ColorPencil colorPencil = colorPencilMap.get(color);
        if(colorPencil == null) {
            colorPencil = new ColorPencil(color);
            colorPencilMap.put(color, colorPencil);
            System.out.println(color + "의 색연필 신규 생성");
        }
        return colorPencil;
    }
}
