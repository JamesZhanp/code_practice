package OCP;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 08 15:26
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        // 此处实现打折的操作
        return super.getPrice() * 0.8;
    }

    // 获取原始的价格
    public Double getOriginPrice() {
        return super.getPrice();
    }
}
