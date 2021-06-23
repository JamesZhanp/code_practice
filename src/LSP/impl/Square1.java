package LSP.impl;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 09 15:27
 *
 * 那么就会发现，没有办法设置宽度了。对于 resize 场景来说，正方形是不适合该场景的；
 *
 * 所以这里还是只能用于长方形。说明了，长方形和正方形在该场景中不适合里氏替换原则的
 */
public class Square1 implements Quadrangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return this.getSideLength();
    }

    @Override
    public long getLength() {
        return this.getSideLength();
    }
}
