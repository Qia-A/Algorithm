package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣746 使用最小花费爬楼梯
 * https://leetcode.cn/problems/min-cost-climbing-stairs/
 * 给你一个整数数组cost，其中cost[i]是从楼梯第i个台阶向上爬需要支付的费用。
 * 一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * 你可以选择从下标为0或下标为1的台阶开始爬楼梯。
 * 请你计算并返回达到楼梯顶部的最低花费。
 *
 * @author QIA
 * @create 2022-11-23-14:37
 */
public class Demo03 {
    public static int minCostClimbingStairs(int[] cast) {
        int[] dp = new int[cast.length+1];
        dp[0] = cast[0];
        dp[1] = cast[1];
        for (int i = 2; i < cast.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cast[i];
        }
        return Math.min(dp[cast.length - 1],dp[cast.length - 2]);
    }

    public static void main(String[] args) {
        //测试用例
        int[] scot = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(scot));
    }
}
