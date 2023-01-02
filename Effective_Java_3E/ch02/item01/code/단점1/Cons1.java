package ch02.item01.code.단점1;

/**
 * Name 클래스는 정적 팩터리 메서드만 지원하기 때문에
 * 상속이 불가능 하다는 점을 확인할 수 있다.
 * public class Cons1 extends Name{
 */
public class Cons1 {


    private Name name = Name.nameOf("junhee");
}
