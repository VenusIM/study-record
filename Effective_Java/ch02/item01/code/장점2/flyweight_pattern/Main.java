package ch02.item01.code.장점2.flyweight_pattern;

public class Main {
    public static void main(String[] args) {

        String[] colorList = {"빨간색", "주황색", "노란색", "초록색", "파랑색", "남색", "보라색"};
        
        // 신규 생성
        System.out.println("============== 신규 생성 ==============");
        for(String color : colorList) {
            ColorPencil colorPencil = ColorPencilFactory.getColorPencil(color);
            colorPencil.info();
        }

        // 저장 정보 확인하여 그대로 반환
        System.out.println("============== 반환 ==============");
        for(String color : colorList) {
            ColorPencil colorPencil = ColorPencilFactory.getColorPencil(color);
            colorPencil.info();
        }

    }
}
