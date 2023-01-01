package ch02.item01.code.장점1;

/**
 *  정적 팩터리 메서드 장점 1
 *  이름을 가질 수 있다.
 */

public class Pros1 {

    private String name;

    // private 생성자
    private Pros1(String name) {
        this.name = name;
    }

    public static Pros1 nameOf(String name) {
        return new Pros1(name);
    }

    public String getName() {
        return name;
    }
}
