package ch02.item07.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
//        memoryCheck();
        return elements[--size];
    }


    public Object popThenNull() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
//        memoryCheck();
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
//            memoryCheck();
        }
    }

//    private void memoryCheck() {
//        System.out.println(" Memory >> "+ (TOTAL_MEMORY - Runtime.getRuntime().freeMemory()));
//    }
}

