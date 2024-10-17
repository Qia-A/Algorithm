package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣343  整数拆分
 * https://leetcode.cn/problems/integer-break/
 * 给定一个正整数n，将其拆分为k个正整数的和（k >= 2），并使这些整数的乘积最大化。
 * 返回你可以获得的最大乘积 。
 *
 * @author QIA
 * @create 2022-11-23-23:07
 */
public class Demo06 {
    public static int integerBreak(int n) {
        //定义动态规划数组，并进行初始化
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                //根据状态的转移，依次按大小记录到数组种
                dp[i] = Math.max(dp[i],Math.max((i-j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        //测试用例
        int n = 10;
        System.out.println(integerBreak(n));
    }
}
