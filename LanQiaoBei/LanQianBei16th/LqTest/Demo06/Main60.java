package LanQianBei16th.LqTest.Demo06;

import java.util.Scanner;

/**
 * 3601  Frog
 * @author QIA
 * @create 2025-04-05-15:19
 */
public class Main60 {
    // t为测试用例数量，n为路径长度，a~b为跳跃范围，k为跳跃次数
    static int t,n,a,b,k,arr[],dp[][],ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();  // 多个测试用例
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n+1];
            dp = new int[k+1][n+1];
            for (int j = 1; j <= n; j++) {
                // 为路径上的每个位置昆虫的数量
                arr[j] = sc.nextInt();
            }
            // 用于存储每个状态下吃到的最多虫子数
            for (int j = 0; j <= k; j++) {
                for (int l = 0; l <= n; l++) {
                    dp[j][l] = -0x3f3f3f3f;
                }
            }
            // 青蛙起步点，虫子数为0
            dp[0][0] = 0;
            // 用于记录吃到的最多虫子数
            ans = 0;

            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    for (int m = a; m <= b; m++) {
                        if (l < m) continue;
                        // 更新状态值
                        dp[j][l] = Math.max(dp[j][l],arr[l]+dp[j-1][l-m]);
                    }
                    // 更新最多虫子数
                    ans=Math.max(ans, dp[j][l]);
                }
            }
            System.out.println(ans);
        }
    }
}
