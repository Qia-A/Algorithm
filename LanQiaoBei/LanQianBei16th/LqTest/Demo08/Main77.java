package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 蓝桥题库  一维差分
 * 差分实质是将区间更新转换为两点更新，时间复杂度变成了O(n)
 * @author QIA
 * @create 2025-04-10-11:42
 */
public class Main77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 表示序列长度
        int m = sc.nextInt();  // 表示操作次数
        int[] a = new int[n + 1];  // 原始数组
        int[] b = new int[n + 10]; // 表示差分数组
        int[] c = new int[n + 10]; // 前缀和数组

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] - a[i-1];  // 记录数组的差分
        }
        while (m-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            // 用差分后的数组进行两点更新
            b[l] += d;
            b[r+1] -=d;
        }

        // 更新后前缀和数组是c[i-1]+b[i]
        for (int i = 1; i <= n; i++) {
            c[i] = c[i-1] + b[i];
            System.out.print(c[i]+" ");
        }
    }
}