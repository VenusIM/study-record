package ch02.item09.auto_closable;

public class AutoCloseableImpl extends NoneAutoClosable implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("AutoClosable >> Close!!");
    }
}
