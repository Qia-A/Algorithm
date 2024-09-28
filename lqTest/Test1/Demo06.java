package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 算法训练  拿金币  DP
 * 题目：有一个N x N的方格,每一个格子都有一些金币,只要站在格子里就能拿到里面的金币。你站在最左上角的格子里,每次可以从一个格子走到它右边或下边的格子里。
 * 请问如何走才能拿到最多的金币。
 * 输入格式：第一行输入一个正整数n。
 *          以下n行描述该方格。金币数保证是不超过1000的正整数。
 * 输出格式：最多能拿金币数量
 * 样例输入:
 *  3
 *  1 3 3
 *  2 2 2
 *  3 1 2
 * 样例输出:  11
 * 数据规模和约定:  n<=1000
 *
 * @author QIA
 * @create 2023-02-19-21:21
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt(); // a数组用来存放每个格子的金币数
            }
        }
        int dp[][] = new int[n][n];
        dp[0][0] = a[0][0]; // 第一个格子的最大值就是第一个格子的金币数
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + a[0][i]; // 第一行因为每个格子的上面没有格子，所有只能加上左边格子的金币总数量
            dp[i][0] = dp[i-1][0] + a[i][0]; // 第一列因为每个格子的左边没有格子，所以只能加上上面格子的金币总数量
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + a[i][j]; // 加上上面格子和左边格子更大的金币数
            }
        }
        System.out.println(dp[n-1][n-1]); // 最后一个即是n*n个格子的最大值
    }
}
