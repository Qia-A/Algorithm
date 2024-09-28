package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2022 省赛  积木画
 * @author QIA
 * @create 2023-03-20-22:12
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int n = sc.nextInt();
        int[][] dp = new int[n+1][4];
        dp[1][0] = 1;
        dp[1][3] = 1; // 情况初始化，初始画布下仅在情况3
        for (int i = 2; i <= n; i++) {
            // 情况0 的计算
            dp[i][0] = dp[i-1][3];
            // 情况1和情况2的计算
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % mod;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % mod;
            // 情况3 的计算
            dp[i][3] = (((dp[i - 1][0] + dp[i-1][1]) % mod + dp[i-1][2]) % mod + dp[i-1][3]) % mod;
        }
        System.out.println(dp[n][3]);
        sc.close();
    }
}
