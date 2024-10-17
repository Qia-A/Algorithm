package Contest_23.LiKou.DP.pack0_1;

/**
 * 标准的背包问题
 * 背包最大重量为4
 *      重量   价值
 * 物品0  1     15
 * 物品1  3     20
 * 物品2  4     30
 * 求：背包能背的物品最大价值是多少？
 * 
 * @author QIA
 * @create 2023-03-28-0:53
 */
public class Big_01 {

    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int bagSize = 4;

        // 1.确定dp数组及下标的含义   bagSize+1 为防止下标越界
        int[][] dp = new int[weight.length][bagSize+1];

        // 2.初始化
        for (int j = weight[0]; j <= bagSize; j++) {
            dp[0][j] = value[0];
        }

        // 3.确定遍历顺序
        // 遍历物品，小于物品的总数
        for (int i = 1; i < weight.length; i++) {
            // 遍历背包，小于背包的最大容量
            for (int j = 0; j <= bagSize; j++) {
                // 判断 背包容量是否小于物品i
                if (j < weight[i]) {
                    /**
                     * 当前背包的容量都没有当前物品i大的时候，是不放物品i的
                     * 那么前i-1哥物品能方向的最大价值就是当前情况的最大价值
                     */
                    dp[i][j] = dp[i - 1][j];
                }else {
                    // 当前分为两种情况：1.不放物品i   2.放物品i
                    // 比较这两种情况下，哪种背包中物品的最大价值最大
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i]] + value[i]);
                }
            }
        }

        // 打印数组
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j <= bagSize; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // 1.确定dp数组及下标的含义
        // i 表示物品编号，j表示背包重量
        // dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少。

        // 2.确定递推公式
        // dp[i][j] = max(dp[i-1][j], dp[i-1][j-weight[i] + value[i]])

        // 3.dp数组如何初始化
        // 初始化
        // 因为一开始默认为0，所以可省去当背包容量为0时，任何物品能存放的最大价值均为0的初始化
        // 当j < weight[0] 的时候，dp[0][j] 为0，因为背包容量比物品0还小；当 j >= weight[0] 是，dp[0][j] 应该是value[0]，因为背包容量足够放物品0
        /**       for (int j = 0; j < w; j++) {
                    dp[0][j] = value[0];
                  }
         */

        // 4.确定遍历顺序：先遍历物品，再遍历背包
        // weight[i] 表示物品i的重量；
        /**     for (int i = 0; i < weight.size(); i++) {
                    for (int j = 0; j < w; j++) {
                        if (j < weight[i]) {
                            dp[i][j] = dp[i-1][j]; // 这个是为了展示dp 数组里元素的变化
                        }else {
                            dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
                        }
                    }
              }
         */

        // 5.举例推到dp数组

    }
}
