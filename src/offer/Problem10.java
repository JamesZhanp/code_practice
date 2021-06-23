package offer;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 21 17:25
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem10 {
    public int fib(int n){
        int x = 0, y  = 1;
        int result = 0;
        for (int i = 0; i < n ; i++){
            result = (x + y) % 1000000007;
            x = y;
            y = result;
        }
        return x;

    }

    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        System.out.println(problem10.fib(0));
        System.out.println(problem10.fib(1));
        System.out.println(problem10.fib(2));
        System.out.println(problem10.fib(3));
        System.out.println(problem10.fib(4));
        System.out.println(problem10.fib(5));
        System.out.println(problem10.fib(6));
        System.out.println(problem10.fib(7));
        System.out.println(problem10.fib(48));
    }
}
