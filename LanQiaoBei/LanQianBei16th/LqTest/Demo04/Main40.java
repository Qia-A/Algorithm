package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 765 数的划分
 * 递归
 * @author QIA
 * @create 2025-03-19-18:40
 */
public class Main40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        sc.close();
        System.out.println(fun(n,k));
    }

    /**
     * 分两种情况:
     * 一种是至少有一个部分为1。这时候剩下的n-1分成k-1部分。
     * 另一种是所有部分都>=2，这时候每个部分减1，总和减少k，即n-k分成k部分。
     */
    private static int fun(int n, int m) {
        if (n < m) return 0;
        if (n == 1)return 1;
        if (m == 1)return 1;
        return fun(n-m, m)+fun(n-1, m-1);
    }
}
