package ch02.item03.mock_test;

/**
 * 클래스를 싱클턴으로 만들면 이를 사용하는 클라이언트를
 * 테스트하기 어려워질 수 있다.
 * -> 인터페이스를 구현하여 가짜(mocK) 구현으로 대체할수 있다.
 */
public class TestApp {
    public static void main(String[] args) {

        //무조건 싱글톤 오브젝트의 startAll을 호출하여 Junhee 오브젝트의 move, run을 호출
        PersonBehavior personBehavior = new PersonBehavior(Junhee.INSTANCE);
        System.out.println("=========== Before StartAll ===========");
        System.out.println(personBehavior.isMoveBehavior());
        System.out.println(personBehavior.isRunBehavior());
        System.out.println("=======================================");
        personBehavior.startAll();
        System.out.println("=========== After StartAll ===========");
        System.out.println(personBehavior.isMoveBehavior());
        System.out.println(personBehavior.isRunBehavior());
        System.out.println("=======================================");

        //Interface를 이용하여 MockPerson 대역을 통해 테스트 가능하다.
        personBehavior = new PersonBehavior(new MockPerson());
        System.out.println("=========== Before StartAll ===========");
        System.out.println(personBehavior.isMoveBehavior());
        System.out.println(personBehavior.isRunBehavior());
        System.out.println("=======================================");
        personBehavior.startAll();
        System.out.println("=========== After StartAll ===========");
        System.out.println(personBehavior.isMoveBehavior());
        System.out.println(personBehavior.isRunBehavior());
        System.out.println("=======================================");
    }

}
