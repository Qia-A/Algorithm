package LiKou.DP;

/**
 * 动态规划
 * 力扣1049 最后一块石头的重量
 * https://leetcode.cn/problems/last-stone-weight-ii/
 * 有一堆石头，用整数数组stones表示。其中stones[i]表示第i块石头的重量。
 * 每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为x和y，且x <= y。那么粉碎的可能结果如下：
 * 如果x == y，那么两块石头都会被完全粉碎；
 * 如果x != y，那么重量为x的石头将会完全粉碎，而重量为y的石头新重量为y-x。
 * 最后，最多只会剩下一块石头。返回此石头最小的可能重量。如果没有石头剩下，就返回0。
 *
 * @author QIA
 * @create 2022-11-24-17:12
 */
public class Demo07 {
    public static int lastStone(int[] stones) {
        //确定dp数组以及下标的含义：dp[j]表示容量为j的背包，最多可以背dp[j]这么重的石头。
        //参考01背包确定递推公式为：dp[j] = Math.max(dp[j],dp[j - weight[i]] + value[i]);
        //dp数组初始化，因提示 1<= stones.length <= 30, 1<= stones[i] <= 1000 所以最大重量就是30 * 1000
        int[] dp = new int[15001];
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int target = sum / 2;
        for (int i = 0; i < stones.length; i++) {//遍历物品
            for (int j = target; j >= stones[i] ; j--) {//遍历背包
                dp[j] = Math.max(dp[j],dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[target] - dp[target];
    }

    public static void main(String[] args) {
        //测试用例
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStone(stones));
    }
}
