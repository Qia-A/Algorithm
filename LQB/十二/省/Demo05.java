package Competition.lanqiao.LQB.十二.省;

import java.util.Scanner;

/**
 *   十二届 省赛 Java C组 试题G: 最少砝码
 *  题目：你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意小于等于 N 的正整数重量。
 *      那么这套砝码最少需要包含多少个砝码?
 *      注意砝码可以放在天平两边。
 *  输入格式：输入包含一个正整数 N。
 *  输出格式：输出一个整数代表答案
 *  样例输入：7
 *  样例输出：3
 *  样例说明：
 *      3 个砝码重量是 1、4、6，可以称出 1至 7的所有重量。
 *      1 = 1;
 *      2=6-4 (天平一边放 6，另一边放 4):
 *      3=4-1;
 *      4 = 4;
 *      5 = 6-1；
 *      6 = 6；
 *      7 = 1+6；
 *      少于 3 个砝码不可能称出 1 至 7的所有重量
 *  评测用例规模与约定：对于所有评测用例，1 <= N <= 1000 000 000.
 *
 * @author QIA
 * @create 2023-03-03-2:37
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();
        // 从 N(砝码) 为1时，开始分析
        // 一个砝码-只有1的情况
        // 二个砝码-只有2-4的情况 1 3-1 3 3+1
        // 三个砝码-只有5-13的情况
        // [ (3^(n-1)-1)/2 + 1,(3^n-1)/ 2 ] 规律区间
        int n = 1;
        while (N != 1) {
            if ((Math.pow(3,n-1)-1)/2 <= N && N <= (Math.pow(3,n)-1)/2) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
