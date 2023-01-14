package ch02.item07;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 1000000000; i++) {
            stack.push(i);
//            stack.pop(); // 391285792
            stack.popThenNull(); // 338888016
        }
        System.out.println(" Free Memory >> "+ (Runtime.getRuntime().freeMemory()));
    }
}
