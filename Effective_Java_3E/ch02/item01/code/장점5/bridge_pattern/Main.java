package ch02.item01.code.장점5.bridge_pattern;

public class Main {

    public static void main(String[] args) {
        Pencil colorPencil = new ColorPencil(new WritingShape());
        colorPencil.writeLine();
        colorPencil.writeCircle();
        colorPencil.writeRectangle();

        Pencil mechanicalPencil = new MechanicalPencil(new WritingShape());
        mechanicalPencil.writeLine();
        mechanicalPencil.writeCircle();
        mechanicalPencil.writeRectangle();

    }

}
