package LSP.impl;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 09 15:25
 */
public class Rectangle1 implements Quadrangle{
    private long length;

    private long width;

    public void setWidth(long width){
        this.width = width;
    }

    public void setLength(long length){
        this.length = length;
    }

    @Override
    public long getWidth() {
        return this.width;
    }

    @Override
    public long getLength() {
        return this.length;
    }
}
