package ch02.item07;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 1000000000; i++) {
            stack.push(new Integer(i));
            stack.pop(); // 238615984
//            stack.popThenNull(); // 298644320
        }
        System.out.println(" Free Memory >> "+ (Runtime.getRuntime().freeMemory()));
    }
}
