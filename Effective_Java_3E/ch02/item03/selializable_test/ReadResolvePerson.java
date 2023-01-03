package ch02.item03.selializable_test;

import java.io.Serializable;

public class ReadResolvePerson implements Serializable {
    public static final ReadResolvePerson INSTANCE = new ReadResolvePerson();

    private ReadResolvePerson(){
    }

    public void move() {
        System.out.println("Person is moving.");
    }

    public void run() {
        System.out.println("Person is running.");
    }

    public Object readResolve() {
        return INSTANCE;
    }

}
