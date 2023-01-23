package ch02.item09.auto_closable;

public class NoneAutoClosable {

        public NoneAutoClosable() {
            System.out.println("Instance Create");
        }

        public void start() throws IllegalAccessException {
            System.out.println("Start!!");
        }

        public void close() {
            System.out.println("NoneAutoClosable >> Close!!");
        }
}
