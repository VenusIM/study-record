package ch02.item01.code.장점3_장점4;

/**
 * 장점 3. 하위 타입 객체를 반환할 수 있는 능력이 있다.
 * 장점 4. 입력 매개변수에 따라 매번 다른 객체를 반환할수 있다.
 */
public interface Pencil {

    //default Pencil of(String color) {

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
