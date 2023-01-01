package ch02.item01.code.장점1;

public class Main {
    public static void main(String[] args) {

        // private을 통한 기본 생성 불가
        // Ex1 ex1 = new Ex1("junee");

        Ex1 ex1 = Ex1.nameOf("junhee");
        System.out.print(ex1.getName());

    }
}
