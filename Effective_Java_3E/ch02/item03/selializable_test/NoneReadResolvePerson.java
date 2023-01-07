package ch02.item03.selializable_test;

import java.io.Serializable;

public class NoneReadResolvePerson implements Serializable {

    private transient String temp;

    public static final NoneReadResolvePerson INSTANCE = new NoneReadResolvePerson();

    private NoneReadResolvePerson(){
    }

    public void move() {
        System.out.println("Person is moving.");
    }

    public void run() {
        System.out.println("Person is running.");
    }
}
