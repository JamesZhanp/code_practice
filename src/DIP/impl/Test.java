package DIP.impl;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 08 16:55
 */
public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();

        geely.studyCourse(new JavaCourse());
        geely.studyCourse(new FECourse());
    }
}
