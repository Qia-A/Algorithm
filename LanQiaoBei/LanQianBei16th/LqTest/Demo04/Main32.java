package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 389 摆花
 * @author QIA
 * @create 2025-03-17-21:14
 */
public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dp = new int[n+1][m+1]; // n为花的种类，m为总共盆数
        int[] a = new int[n+1]; // 用来表示每种花摆多少盆
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt(); // 输入每种花由多少盆
        }

        // 表示第 i 种花摆0盆为1种方案
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {  // 遍历花的种类
            for (int j = 1; j <= m; j++) {  // 遍历花的总盆数
                for (int k = 0; k <= j&&k <= a[i]; k++) {  // 遍历每种花的盆数
                    dp[i][j] += dp[i-1][j-k];
                    dp[i][j] %= (int)1e6+7; // 取模
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
