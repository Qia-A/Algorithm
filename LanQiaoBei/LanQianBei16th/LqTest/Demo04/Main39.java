package LanQianBei16th.LqTest.Demo04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 786 纪念品
 * @author QIA
 * @create 2025-03-19-17:07
 */
public class Main39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取未来天数t，纪念品数量n，初始金币数量m
        int t = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 存储每天每种纪念品的价格
        int[][] arr = new int[t+1][n+1];
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        // dp[i]表示第 i 天结束时最多拥有的金币数量
        int[] dp = new int[10001];
        int money = m;

        // 遍历每一天
        for (int day = 1; day < t; day++) {
            // 重置dp数组，处理当天的背包问题
            Arrays.fill(dp, 0);
            // 遍历每种纪念品
            for (int item = 1; item <= n; item++) {
                int cost = arr[day][item]; // 当日成本
                int profit = arr[day+1][item] - cost; // 单件利润
                // 完全背包：正序更新; 计算该纪念品当日最多能获得多少利润
                for (int p = cost; p <= money; p++) {
                    dp[p] = Math.max(dp[p], dp[p - cost] + profit);
                }
            }
            // 更新当天结束时拥有的金币数量,以作为第二天的初始金币
            money += dp[money];
        }
        System.out.println(money);
    }
}
