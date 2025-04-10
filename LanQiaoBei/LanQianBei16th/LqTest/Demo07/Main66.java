package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 *  3712 最小伤害
 * @author QIA
 * @create 2025-04-08-11:48
 */
public class Main66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hurm = new int[n+2];
        for (int i = 1; i <= n; i++) {
            hurm[i] = sc.nextInt();
        }
        sc.close();

        int[] dp = new int[n+2];
        dp[1] = hurm[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-1]+hurm[i],dp[i-2]+hurm[i]);
        }
        System.out.println(dp[n+1]);
    }
}
