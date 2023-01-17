package ch02.item09;

import java.util.Properties;

public class AutoCloseableImpl extends NoneAutoClosable implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("AutoClosable >> Close!!");
    }
}
