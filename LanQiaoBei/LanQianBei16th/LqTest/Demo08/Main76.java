package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 一维前缀和模板
 * @author QIA
 * @create 2025-04-10-11:19
 */
public class Main76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();  // 输入序列长度
        int q = sc.nextInt();  // 输入查询次数
        // 数组大小为n+1
        // 不往数组下标为0的位置存东西，从1开始存，让下标余实际位置相同，便于理解
        int[] a = new int[n + 1]; // 用于存放序列用的每一个数
        int[] s = new int[n + 1]; // 前缀和数组，提前计算好1，1~2，1~3，……，1~n
        // 把序列存入数组中
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            s[i] = s[i-1]+a[i];
        }
        while (q-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(s[r]-s[l-1]);
        }
        sc.close();
    }
}
