package ch02.item01.code.장점3_장점4;

public class Main {
    public static void main(String[] args) {

        Pencil redPencil = Pencil.of("Red");
        Pencil bluePencil = Pencil.of("Blue");
        Pencil notPencil = Pencil.of("Black");

        redPencil.info();
        bluePencil.info();
        notPencil.info();
    }
}
