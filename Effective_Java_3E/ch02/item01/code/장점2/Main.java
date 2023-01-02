package ch02.item01.code.장점2;

/**
 * 정적 팩터리 메서드 장점 2
 * 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
 */
public class Main {
    public static void main(String[] args) {

        Pros2 instance1 = Pros2.getInstance();
        Pros2 instance2 = Pros2.getInstance();

        System.out.println("instance1 == instance2 >> " + (instance1 == instance2));
        System.out.print("instance1.equals(instance2) >> " + instance1.equals(instance2));
    }
}
