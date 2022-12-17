package LiKou.DP;

/**
 * 动态规划
 * 力扣509 斐波那契数列
 * https://leetcode.cn/problems/fibonacci-number/
 * 斐波那契数（通常用F(n)表示）形成的序列称为斐波那契数列。
 * 该数列由0和1开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0，F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给定n，请计算F(n)。
 *
 * @author QIA
 * @create 2022-11-23-11:47
 */
public class Demo01 {
    //动态规划
    public static int fid(int n){
        if (n <= 1){
            return n;
        }
        int[] dp = new int[30];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2;i <= n;i++){
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }
    public static int fid1(int n){
        //递归解法  不太懂……
        if (n < 2){
            return n;
        }
        return fid1(n - 1) + fid1(n-2);
    }

    public static void main(String[] args) {
        //输入斐波那契数列第n项，输出它对应的值
        //测试用例
        int n = 10;
        System.out.println(fid1(n));


    }
}
