package DIP;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 08 16:43
 * 当出现需要添加科目的时候，如果需要在Geely中
 * 修改， 那么就破坏了依赖倒置原则
 * 因此此处添加impl包用来实现依赖倒置原则
 *
 * */
public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();

        geely.studyEFCourse();
        geely.studyJavaCourse();
    }
}
