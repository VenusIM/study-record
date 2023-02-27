package ch04.item15.Serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream objectOutputStream  =  new ObjectOutputStream(new FileOutputStream("C:\\Users\\yim33\\IdeaProjects\\Study_Record\\Effective_Java_3E\\ch04\\item15\\Serializable\\SerializableTest.txt"));
        objectOutputStream.writeObject(new SerializableTest());
    }
}
