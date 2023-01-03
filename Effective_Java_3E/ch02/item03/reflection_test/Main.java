package ch02.item03.reflection_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Reflection을 이용한 private에 접근 가능함으로
 * 두번째 생성을 막아준다.
 * Field Singleton, Static Factory Method 방식일 경우 고려해야 한다.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Constructor<Person> constructor = Person.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            Person person = Person.INSTANCE;
            Person person1 = constructor.newInstance();
            Person person2 = constructor.newInstance();

            System.out.println(person == person1);
            System.out.println(person1 == person2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
