package ch02.item01.code.장점1;

public class Main {
    public static void main(String[] args) {

        // private을 통한 기본 생성 불가
        // Ex1 ex1 = new Ex1("junee");

        Pros1 pros1 = Pros1.nameOf("junhee");
        System.out.print(pros1.getName());

    }
}
