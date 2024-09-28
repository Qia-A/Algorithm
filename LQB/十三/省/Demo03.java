package Competition.lanqiao.LQB.十三.省;

import java.util.Scanner;

/**
 * 十三届  试题D:求和
 * 问题描述：给定n个整数 a1,a2，··,an ，求它们两两相乘再相加的和，即:
 *               S =a1'a2 +a1·a3 +..·+a1:an +ag:ag +..·+an-2·an-1+an-2'an 十an-1'an
 * 输入格式：
 *    输入的第一行包含一个整数n。
 *    第二行包含 n 个整数 a1,a2,···,n。
 * 输出格式：
 *    输出一个整数 S，表示所求的和。请使用合适的数据类型进行运算。
 * 样例输入： 4
 *    1 3 6 9
 * 样例输出： 117
 * 评测用例规模与约定：
 *      对于 30% 的数据，1 < n < 1000,1 < ai< 100
 *      对于所有评测用例，1 < n < 200000,1 < ai< 1000
 * 运行限制：最大运行时间：1s   最大运行内存: 512M
 * @author QIA
 * @create 2023-03-08-15:43
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long S = 0;
        int n = s.nextInt();
        long[] num=new long[n];

        //对数组赋值
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextLong();
            S += num[i]; //对数组求和
        }

        // 结果
        long res = 0;
        for (int i = 0; i < num.length-1; i++) {
            // 依次减去当前索引所指的数
            S -= num[i];
            // 累加求和
            res += S * num[i];
        }
        System.out.println(res);
    }
}
