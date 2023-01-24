package ch02.item08;

import javax.imageio.stream.ImageInputStream;

public class StreamFinalizer extends com.sun.imageio.stream.StreamFinalizer {

    private ImageInputStream imageInputStream;
    public StreamFinalizer(ImageInputStream stream) {
        super(stream);
        this.imageInputStream = stream;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(imageInputStream.getBitOffset() + " >> finalize Call");
    }
}
