package LSP;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 09 15:17
 * 结果：
 * 在验证 resize 场景中，正方形是否是长方形这一子类的时候，替换之后，再次运行 resize 方法的时候，行为改变了，不能结束了；
 */
public class Test {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("Width:" + rectangle.getWidth() + ";" + " Length:" + rectangle.getLength());
        }
        System.out.println("resize 方法结束：width:" + rectangle.getWidth() +
                "  length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);

        Square square = new Square();
        square.setSideLength(10);
        resize(square);
    }
}
