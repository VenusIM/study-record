package ch02.item03.reflection_test;
/**
 Reflection을 이용한 private에 접근 가능함으로
 * 두번째 생성을 막아준다.
 * Field Singleton, Static Factory Method 방식일 경우 고려해야 한다.
 */
import javax.management.InstanceAlreadyExistsException;

public class Person {
    public static final Person INSTANCE = new Person();
    private static boolean isCreated;

    private Person(){
        if(isCreated) {
            try {
                throw new InstanceAlreadyExistsException("싱글톤으로 생성 불가능합니다.");
            } catch (InstanceAlreadyExistsException e) {
                System.out.println(e.getMessage());
            }
        }
        isCreated = true;
    }

    public void move() {
        System.out.println("Person is moving.");
    }

    public void run() {
        System.out.println("Person is running.");
    }
}
