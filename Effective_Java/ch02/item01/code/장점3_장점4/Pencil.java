package ch02.item01.code.장점3_장점4;

public interface Pencil {
    static Pencil of(String color) {
        if("Red".equals(color)) {
            return new RedPencil();
        }else if ("Blue".equals(color)) {
            return new BluePencil();
        } else {
            return new NotPencil();
        }
    }

    void info();
}
