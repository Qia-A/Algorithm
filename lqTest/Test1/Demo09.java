package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 试题 杨辉三角形 【第十二届】【省赛】【C组】
 * 题目： 如果我们按照杨辉三角形，从上到下、从左到右的顺序把所有数排成一列，可以得到如下
 * 数列：1，1，1，1，2，1，1，3，3，1，1，4，6，4，1，……
 * 给定一个正整数 N，请你输出数列中第一次出现 N 是在第几个数？
 * 输入格式：输入一个整数 N。
 * 输出格式：输出一个整数代表答案。
 * 样例输出：6
 * 样例输出：13
 * 评测用例规模与约定
 *    对于 20% 的评测用例，1 <= N <= 10;
 *    对于所有评测用例，1 <= N <= 1000 000 000。
 *
 * @author QIA
 * @create 2023-02-28-18:18
 */
public class Demo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();//输入值进行查找
        long[] arr =new long[44725];
        arr[0]=1;
        long k=1L;//k 来定义位置
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1;i<44725; i++) {
            for (int j = i; j>=1; j--) {
                arr[j] += arr[j - 1];//换行后用自己进行运算，以减少内存
                if (arr[j] == n) {
                    System.out.println(k + i-j + 1);
                    return;//如果找到了就返回
                }
            }
            k+=(i+1);
        }
        System.out.println(((1 + n) * n / 2) + 2);
    }
}
