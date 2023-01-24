package ch02.item08;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class FinalizerMain {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 1000; i++) {
            ImageInputStream imageInputStream = new ImageInputStreamImpl();
            try {
                imageInputStream.setBitOffset(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
            new StreamFinalizer(imageInputStream);
            System.out.println(i + " >> Instance");
            System.gc();
        }

    }
}
