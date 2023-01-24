package ch02.item08;

import javax.imageio.stream.IIOByteBuffer;
import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

public class ImageInputStreamImpl implements ImageInputStream {

    private int offset;

    @Override
    public void setByteOrder(ByteOrder byteOrder) {

    }

    @Override
    public ByteOrder getByteOrder() {
        return null;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void readBytes(IIOByteBuffer buf, int len) throws IOException {

    }

    @Override
    public boolean readBoolean() throws IOException {
        return false;
    }

    @Override
    public byte readByte() throws IOException {
        return 0;
    }

    @Override
    public int readUnsignedByte() throws IOException {
        return 0;
    }

    @Override
    public short readShort() throws IOException {
        return 0;
    }

    @Override
    public int readUnsignedShort() throws IOException {
        return 0;
    }

    @Override
    public char readChar() throws IOException {
        return 0;
    }

    @Override
    public int readInt() throws IOException {
        return 0;
    }

    @Override
    public long readUnsignedInt() throws IOException {
        return 0;
    }

    @Override
    public long readLong() throws IOException {
        return 0;
    }

    @Override
    public float readFloat() throws IOException {
        return 0;
    }

    @Override
    public double readDouble() throws IOException {
        return 0;
    }

    @Override
    public String readLine() throws IOException {
        return null;
    }

    @Override
    public String readUTF() throws IOException {
        return null;
    }

    @Override
    public void readFully(byte[] b, int off, int len) throws IOException {

    }

    @Override
    public void readFully(byte[] b) throws IOException {

    }

    @Override
    public void readFully(short[] s, int off, int len) throws IOException {

    }

    @Override
    public void readFully(char[] c, int off, int len) throws IOException {

    }

    @Override
    public void readFully(int[] i, int off, int len) throws IOException {

    }

    @Override
    public void readFully(long[] l, int off, int len) throws IOException {

    }

    @Override
    public void readFully(float[] f, int off, int len) throws IOException {

    }

    @Override
    public void readFully(double[] d, int off, int len) throws IOException {

    }

    @Override
    public long getStreamPosition() throws IOException {
        return 0;
    }

    @Override
    public int getBitOffset() throws IOException {
        return offset;
    }

    @Override
    public void setBitOffset(int bitOffset) throws IOException {
        this.offset = bitOffset;
    }

    @Override
    public int readBit() throws IOException {
        return 0;
    }

    @Override
    public long readBits(int numBits) throws IOException {
        return 0;
    }

    @Override
    public long length() throws IOException {
        return 0;
    }

    @Override
    public int skipBytes(int n) throws IOException {
        return 0;
    }

    @Override
    public long skipBytes(long n) throws IOException {
        return 0;
    }

    @Override
    public void seek(long pos) throws IOException {

    }

    @Override
    public void mark() {

    }

    @Override
    public void reset() throws IOException {

    }

    @Override
    public void flushBefore(long pos) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public long getFlushedPosition() {
        return 0;
    }

    @Override
    public boolean isCached() {
        return false;
    }

    @Override
    public boolean isCachedMemory() {
        return false;
    }

    @Override
    public boolean isCachedFile() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }
}
