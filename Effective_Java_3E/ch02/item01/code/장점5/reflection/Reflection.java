package ch02.item01.code.장점5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("ch02.item01.code.장점5.reflection.TestBean");
            Constructor constructor = aClass.getDeclaredConstructors()[0];

            // private 접근제어자를 가지고 있지만 reflection 을 이용하여 해지할수 있다.
            constructor.setAccessible(true);
            TestBean testBean = (TestBean) constructor.newInstance();

            Field[] fields = aClass.getDeclaredFields();
            Arrays.asList(fields).forEach(f -> {
                f.setAccessible(true);
                System.out.println("필드명 >> "+f.getName());
                System.out.println("필드 타입 >> "+f.getType());
            });

            Method methods = aClass.getDeclaredMethods()[0];
            methods.setAccessible(true);
            try {
                methods.invoke(testBean);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
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
