package ch02.item09.try_finally;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        Reader reader = new Reader();
        try {
            reader.init("").readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
