package ch02.item01.code.장점3_장점4;

public class Main {
    public static void main(String[] args) {

       Pencil.of("Red").info();
       Pencil.of("Blue").info();
       Pencil.of("Black").info();


        /*
        Pencil pencil = new Pencil() {
            @Override
            public void info() {
            }
        };

        pencil.of("Red").info();
        pencil.of("Blue").info();
        pencil.of("Black").info();
        */

    }
}
