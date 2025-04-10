package Contest_23.LanQiaoBei14th.Carl.DP;

/**
 * 1049 最后一块石头的重量 ||
 *
 * @author QIA
 * @create 2023-04-02-15:59
 */
public class Demo01 {
    public static void main(String[] args) {
        // 动规五步曲
        // 1. 确定dp数组以及下标的含义
        // dp[j] 表示容量为j的背包，最多可以背最大重量为dp[j]。
        // 2. 确定递推公式：dp[j] = max(dp[j], stones[i]] + stones[i]);
        // 3. dp数组如何初始化 dp[j]全部初始化为0
        // 4. 确定遍历顺序
        // 5. 举例推导dp数组

        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(stones));
    }

    private static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int s : stones) {
            sum += s;
        }

        int target = sum / 2;
        // 初始化，dp[i][j]为可以放 0-i 物品，背包容量为 j 的情况下背包中的最大价值
        int[][] dp = new int[stones.length][target + 1];
        // dp[i][0]默认初始化为0
        // dp[0][j] 取决于stones[0]
        for (int i = stones[0]; i <= target; i++) {
            dp[0][i] = stones[0];
        }

        for (int i = 1; i < stones.length; i++) {
            for (int j = 1; j <= target; j++) { // 注意是等于
                if (j >= stones[i]) {
                    // 不放：dp[i - 1][j] 放：dp[i - 1][j - stones[i]] + stones[i]
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

//        System.out.println(dp[stones.length - 1][target]);
        return (sum - dp[stones.length - 1][target]) - dp[stones.length - 1][target];
    }
}
