package Competition.lanqiao.lqTest.Test3;

import java.util.Scanner;

/**
 * 动态规划  2020 模拟赛
 * 摆动序列
 * @author QIA
 * @create 2023-03-27-9:20
 */
public class Demo02 {

    static int[][] dp = new int[1004][1004];
    public static int isList(int m, int n) {
        int sum;
        for (int i = 1; i <= n; i++) {
            dp[1][i] = n - i + 1;
        }
        for (int i = 2; i <= m; i++) {
            if (i % 2 != 0) {
                for (int j = n; j >= 1; j--) {
                    dp[i][j] = (dp[i-1][j-1] + dp[i][j+1]) % 10000;
                }
            }else {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = (dp[i-1][j+1] + dp[i][j-1]) % 10000;
                }
            }
        }
        if (m%2 != 0){
            sum = dp[m][1];
        }else {
            sum = dp[m][n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(isList(m, n));
        sc.close();
    }
}
