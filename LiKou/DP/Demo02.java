package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣70 爬楼梯
 * https://leetcode.cn/problems/climbing-stairs/
 * 假设你正在爬楼梯。需要n阶你才能到达楼顶。
 * 每次你可以爬1或2个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author QIA
 * @create 2022-11-23-13:46
 */
public class Demo02 {
    public static int climbStairs(int n) {
        if (n <= 2){
            return n;
        }
        int[] dp = new int[3];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int temp = dp[2] + dp[1];
            dp[1] = dp[2];
            dp[2] = temp;
        }
        return dp[2];
    }
    public static int climbStairs1(int n) {
        //动态规划 思路：
        //dp[]的大小为n，dp[n] = dp[n-1] + dp[n-2];
        //dp[n]为总共的方法数量，dp[n-1]为再爬1个台阶到楼顶的方法，dp[n-2]为再爬2个台阶到楼顶的方法
        //再对dp[]数组进行初始化，
        //确定如何进行遍历
        int[] dp = new int[n+1];
        //初始化 0代表n为1，路径为1
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        //测试用例
        int n = 1;
        System.out.println(climbStairs1(n));
    }
}
