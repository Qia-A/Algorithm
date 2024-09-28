package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.Scanner;

/**
 * 动态规划
 * 思路：
 * 这道题可以用动态规划算法来解决。具体思路如下:
 * 定义状态: dp[i][j] 表示在前 i 个物品中，且背包容量为 j 时所能获得的最大价值。
 * 状态转移: 对于每一个物品，有两种情况，可以选择放入背包中，也可以不放入背包中。
 *          如果选择放入，那么dp[i][j] 的值就是 dp[i - 1] - [j - wi] + vi，即前 i-1 个物品中，
 *          且背包容量为 j - wi 时所能获得的最大价值，加上第 i 个物品的价值 vi; 如果选择不放入，
 *          那么 dp[i][j] 的值就是 dp[i-1][j] ，即前 i-1 个物品中，且背包容量为 j 时所能获得的最大价值。最终， dp[N][V]即为所求.
 * 初始化:  当 i = 0 时，dp[o][j] = 0，当j = 0 时， dp[i][0] = 0根据上述思路，我们可以写出动态规划算法的代码。时间复杂度为 O(NV)。
 * @author QIA
 * @create 2023-04-04-15:04
 */
public class _7小明的背包 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int V = sc.nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][V + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= V; j++) {
                if (j >= w[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][V]);
    }
}
