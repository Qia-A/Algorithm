package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 进制  优秀的拆分
 * 题目描述：
 *      一般来说，一个正整数可以拆分成若干个正整数的和。
 *      例如，1=1，10=1+2+3+4等。对于正整数n的一种特定拆分，我们称它为“优秀的”，当且仅当在这种拆分下，n 被分解为了若千个不同的2的正整数次幂。注意，一个数能被表示成2的正整数次幂，当且仅当2能通过正整数个2相乘在一起得到
 *      例如，10 =8+2=23 +21是一个优秀的拆分。但是，7=4+2+1=22+21 +2就不是一个优秀的拆分，因为1不是2的正整数次幂。
 *      现在，给定正整数n，你需要判断这个数的所有拆分中，是否存在优秀的拆分。若存在，请你给出具体的拆分方案。
 * 输入描述： 输入只有一行，一个整数n(n107)，代表需要判断的数
 * 输出描述： 如果这个数的所有拆分中，存在优秀的拆分。那么，你需要从大到小输出这个拆分中的每一个数，相邻两个数之间用一个空格隔开。可以证明，在规定了拆分数字的顺序后，该拆分方案是唯一的。
 * 若不存在优秀的拆分，输出-1。
 * 输入输出样例：
 *      示例1   输入：6   输出：4  2
 *      示例2   输入：7   输出：-1
 * 运行限制：
 *      最大运行时间: 1s
 *      最大运行内存:128M
 *
 * @author QIA
 * @create 2023-03-09-0:29
 */
public class Demo12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 奇数直接输出-1即可结束
        if (n % 2 != 0) {
            System.out.println(-1);
            return ;
        }

        // 对于偶数的情况，找到2的k次方小于n，且k最大
        while (n != 0){
            n = f(n);
        }
    }

    private static int f(int n) {
        int res = 1;
        while (Math.pow(2, res) <= n) {
            res++;
        }
        System.out.println((int)Math.pow(2, res-1) + " ");
        return n - (int)Math.pow(2, res - 1);
    }
}
