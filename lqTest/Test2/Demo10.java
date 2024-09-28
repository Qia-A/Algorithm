package Competition.lanqiao.lqTest.Test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2021 模拟赛  动态规划、搜索
 * 跳跃
 * @author QIA
 * @create 2023-03-22-13:44
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];
        // 读取输入
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        // 在 dp 前面和左边多加几条  方便计算 dp[i][j]  因为网上会有 dp[i-3][i]  dp[i][j-3]
        int[][] dp = new int[n+3][m+3];
        // 为了不影响计算 dp[i][j] 把整个 dp 都填充最小值
        for(int i = 0; i< dp.length; i++) {
            Arrays.fill(dp[i] ,Integer.MIN_VALUE);
        }
        // nums 和 dp 的下标相差3，初始化只用给首个
        dp[3][3] = nums[0][0];

        for (int i = 3; i < dp.length; i++) {
            for (int j = 3; j < dp[0].length; j++) {
                // 如果是刚才初始化过 dp[3][3]就跳过
                if(i == 3 && j == 3) continue;

                /**
                 * 实现计算前面的max最大值，也就是前面思路的max中的一大堆
                 * 这里不太美观，嫌麻烦的可以用递归或者dfs
                 */
                int max = Integer.MIN_VALUE;
                for (int k = 0; k <= 3; k++) {
                    for (int l = 3-k; l >= 0; l--) {
                        if (k == 0 && l == 0) continue;
                        max = Math.max(max, dp[i-k][j-l]);
                    }
                }
                // 递推公式
                dp[i][j] = nums[i-3][j-3] + max;
            }
        }
        System.out.println(dp[n+2][m+2]);
    }
}
