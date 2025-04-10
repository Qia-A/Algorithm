package LanQianBei16th.LqTest.Demo05;

import java.util.Scanner;

/**
 * 755 过河卒
 * @author QIA
 * @create 2025-03-19-19:06
 */
public class Main42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bx = sc.nextInt(), by = sc.nextInt(), cx = sc.nextInt(), cy = sc.nextInt();
        int[] targetX = { 0, -1, -2, -2, -1, 1, 2,  2,  1 };
        int[] targetY = { 0, -2, -1,  1,  2, 2, 1, -1, -2 };
        long[][] dp = new long[bx + 1][by + 1];
        for (int i = 0; i < 9; ++i) { //标记马进攻坐标
            int x = cx + targetX[i];
            int y = cy + targetY[i];
            if (x >= 0 && x <= bx && y >= 0 && y <= by) {
                dp[x][y] = -1;
            }
        }
        for (int i = 0; i <= bx; ++i) { // 定义dp坐标x初始值
            if (dp[i][0] != -1) {
                dp[i][0] = 1;
            } else break; //截至前i项
        }
        for (int j = 0; j <= by; ++j) { // 定义dp坐标y初始值
            if (dp[0][j] != -1) {
                dp[0][j] = 1;
            } else break; //截至前j项
        }
        for (int i = 1; i <= bx; ++i) {
            for (int j = 1; j <= by; ++j) {
                if (dp[i][j] == 0) {  //不是马进攻坐标，如果是，则当前的上和左不可转移，作废
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; //转移
                    dp[i][j] = Math.max(dp[i - 1][j], 0) + Math.max(dp[i][j - 1], 0);
                }
            }
        }
        System.out.print(dp[bx][by]);
    }
}