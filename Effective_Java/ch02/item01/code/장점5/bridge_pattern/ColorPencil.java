package ch02.item01.code.장점5.bridge_pattern;

public class ColorPencil extends Pencil{

    private final String info = "색연필";

   public ColorPencil(Writing writing) {
       super(writing);
       System.out.println("========== "+info+" ==========");
    }

    @Override
    public void writeLine() {
        System.out.println(info + writing.line());
    }

    @Override
    public void writeCircle() {
        System.out.println(info + writing.circle());
    }

    @Override
    public void writeRectangle() {
        System.out.println(info + writing.rectangle());
    }
}
