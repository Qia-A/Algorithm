package Contest_23.LiKou.DP.pack0_1;

/**
 * @author QIA
 * @create 2023-03-28-2:25
 */
public class Big_01一维 {

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagSize = 4;

        // 1.确定dp数组及下标含义
        // dp[j]表示：容量为j的背包，所背的物品价值可以最大为dp[j].
        int[] dp = new int[bagSize + 1];

        // 2.一维数组递推公式：dp[j] = max(dp[j], dp[j] + value[i])
        // 3.一维数组初始化

        // 4.一维dp数组遍历顺序
        for (int i = 0; i < weight.length; i++) { // 遍历物品容量
            for (int j = bagSize; j >= weight[i]; j--) { // 遍历背包容量
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }

        // 打印dp数组
        for (int i = 0; i < bagSize; i++) {
            System.out.print(dp[i] + " ");
        }

    }
}
