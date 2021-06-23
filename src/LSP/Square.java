package LSP;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 09 15:15
 * 正方形可以认为是一种特殊的长方形
 */
public class Square extends Rectangle {
    // 边长：正方形的长宽是一样的
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
