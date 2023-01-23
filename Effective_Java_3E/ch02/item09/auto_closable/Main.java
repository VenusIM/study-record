package ch02.item09.auto_closable;

public class Main {
    public static void main(String[] args) {

        System.out.println("======== AutoClosable Try-With-Resource =======");
        try(AutoCloseableImpl autoCloseableImpl = new AutoCloseableImpl()) {
            autoCloseableImpl.start();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("======== None close Try-Catch =======");

        NoneAutoClosable noneAutoClosable1 = new NoneAutoClosable();
        try{
            noneAutoClosable1.start();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("======== Finally close Try-Catch-Finally =======");
        NoneAutoClosable noneAutoClosable2 = new NoneAutoClosable();
        try {
            noneAutoClosable2.start();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } finally {
            noneAutoClosable2.close();
        }

    }
}
