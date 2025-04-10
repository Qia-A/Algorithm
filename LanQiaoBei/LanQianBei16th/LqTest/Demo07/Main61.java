package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 * 271 杨老师的照相排列
 * AcWing-https://www.acwing.com/problem/content/description/273/
 * 状态表示：dp[a][b][c][d][e] 表示五排人数分别为a,b,c,d,e时的方案数。
 * 状态转移：由最后一个学生所在排的前一状态转移而来。
 * @author QIA
 * @create 2025-04-05-16:14
 */
public class Main61 {
    static int N = 31;
    static long[][][][][] dp = new long[N][N][N][N][N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int k = sc.nextInt();  // 读取排数k
            if (k == 0) break;  // 输入0结束
            int[] cnt =new int[5];  // 各排人数上限，最多五排
            for (int i = 0; i < k; i++) {
                cnt[i] = sc.nextInt();
            }
            dp[0][0][0][0][0] = 1;
            for (int a = 0; a <= cnt[0]; a++) {
                for (int b = 0; b <= Math.min(a,cnt[1]); b++) {
                    for (int c = 0; c <= Math.min(b, cnt[2]); c++) {
                        for (int d = 0; d <= Math.min(c,cnt[3]); d++) {
                            for (int e = 0; e <= Math.min(d,cnt[4]); e++) {
                                // 状态转移，累加所有可能的来源
                                if (a > 0) dp[a][b][c][d][e] = dp[a-1][b][c][d][e];
                                if (b > 0) dp[a][b][c][d][e] += dp[a][b-1][c][d][e];
                                if (c > 0) dp[a][b][c][d][e] += dp[a][b][c-1][d][e];
                                if (d > 0) dp[a][b][c][d][e] += dp[a][b][c][d-1][e];
                                if (e > 0) dp[a][b][c][d][e] += dp[a][b][c][d][e-1];
                            }
                        }
                    }
                }
            }

            System.out.println(dp[cnt[0]][cnt[1]][cnt[2]][cnt[3]][cnt[4]]);
        }
    }
}




