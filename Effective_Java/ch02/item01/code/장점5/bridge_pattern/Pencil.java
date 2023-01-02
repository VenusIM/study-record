package ch02.item01.code.장점5.bridge_pattern;

/**
 * 필기구 추상 클래스
 */
public abstract class Pencil {

    protected Writing writing;

    protected Pencil(Writing writing) {
        this.writing = writing;
    }

    public abstract void writeLine();

    public abstract void writeCircle();

    public abstract void writeRectangle();

}
