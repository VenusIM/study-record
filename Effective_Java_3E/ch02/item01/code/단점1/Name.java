package ch02.item01.code.단점1;

/**
 *  정적 팩터리 메서드 장점 1
 *  이름을 가질 수 있다.
 */

public class Name {

    private String name;

    // private 생성자
    private Name(String name) {
        this.name = name;
    }

    public static Name nameOf(String name) {
        return new Name(name);
    }

    public String getName() {
        return name;
    }
}
