package algorithm;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * 在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 * Created by zhujia on 2017/9/10.
 */
public class Fibonacci {
    /**
     * 迭代
     * @param n
     * @return
     */
    public int Fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            record[i] = record[i - 1] + record[i - 2];
        }
        return record[n];
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public int Fibonacci2(int n) {
        if (n <= 1) return n;
        else return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
