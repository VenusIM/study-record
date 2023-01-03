package ch02.item03.selializable_test;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            //None ReadResolve
            ObjectOutput objectOutput =  new ObjectOutputStream(new FileOutputStream("NoneReadResolvePerson"));
            objectOutput.writeObject(NoneReadResolvePerson.INSTANCE);

            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("NoneReadResolvePerson"));
            NoneReadResolvePerson noneReadResolvePerson = (NoneReadResolvePerson) objectInput.readObject();
            System.out.println("NoneReadResolvePerson >> "+ (noneReadResolvePerson == NoneReadResolvePerson.INSTANCE));

            //ReadResolve
            objectOutput =  new ObjectOutputStream(new FileOutputStream("ReadResolvePerson"));
            objectOutput.writeObject(ReadResolvePerson.INSTANCE);

            objectInput = new ObjectInputStream(new FileInputStream("ReadResolvePerson"));
            ReadResolvePerson readResolvePerson = (ReadResolvePerson) objectInput.readObject();
            System.out.println("ReadResolvePerson >> "+ (readResolvePerson == ReadResolvePerson.INSTANCE));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
