package ch02.item06.lazy_initialization;

public class Main {
    public static void main(String[] args) {

        // 초기화 당시 생성
        Runtime.getRuntime().gc();
        for (int i = 0; i < 100000; i++) {
            new ClassA();
        }
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("초기화 당시 생성할 경우 메모리 사용량                   >> " + used);

        // 지연 초기화
        Runtime.getRuntime().gc();
        for (int i = 0; i < 100000; i++) {
            new LazyInitializationA();
        }
        used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("지연 초기화를 이용하여 호출시 생성할 경우 메모리 사용량    >> " + used);
    }
}
