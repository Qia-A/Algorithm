package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 309 求解台阶问题
 * 题目描述
 * 现一个算法求解台阶问题。介绍如下：
 * 对于高度为 n 的台阶，从下往上走，每一步的阶数为 1，2，3 中的一个。
 * 问要走到顶部一共有多少种走法。
 * 输入描述
 * 输入一个数字N (1≤N≤35)，表示台阶的高度。
 * 输出描述
 * 输出一行，为走法总数。
 * @author QIA
 * @create 2025-03-11-12:24
 */
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(reque(N));

    }
    // 迭代法
    public static int reque(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int n1 = 1;
        int n2 = 2;
        int n3 = 4;
        int count = 0;
        for (int i = 4; i <= n; i++) {
            count = n1+n2+n3;
            n1 = n2;
            n2= n3;
            n3 = count;
        }

        return count;
    }
}
