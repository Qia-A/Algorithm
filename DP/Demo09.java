package LiKou.DP;

/**
 * 动态规划
 * 力扣474 一和零
 * https://leetcode.cn/problems/ones-and-zeroes/
 * 给你一个二进制字符串数组strs和两个整数m和n。
 * 请你找出并返回strs的最大子集的长度，该子集中最多有m个0和n个1。
 * 如果x的所有元素也是y的元素，集合x是集合y的子集。
 *
 * @author QIA
 * @create 2022-11-25-2:33
 */
public class Demo09 {
    public static int findMax(String[] strs,int m,int n){
        //动态规划
        //确定dp数组（dp table）以及下标的含义  dp[i][j]:最多有i个0和j个1的strs的最大子集的大小为dp[i][j]
        //确定递推公式  dp[i][j]就是dp[i - zeroNum][j - oneNum] + 1 : dp[i][j] = Math.max(dp[i][j],dp[j - weight[i] + value[i]]);
        //dp数组如何初始化，初始为0
        //确定遍历顺序   遍历背包容量且从后向前的遍历！
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for (String str:strs) { //遍历物品
            int[] zeroAndOne = calcZeroAndOne(str);
           int zeroNum = zeroAndOne[0];
           int oneNum = zeroAndOne[1];
            for (int i = m;i >= zeroNum;i--) {//遍历背包容量且从后向前遍历
                for (int j = n;j >= oneNum;j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private static int[] calcZeroAndOne(String str) {
        int[] res = new int[2];
        for (char c : str.toCharArray()) {
            res[c - '0']++;
        }
        return res;
    }


    public static void main(String[] args) {
        //测试用例
        String[] strs = {"10","0","1"};
        int m = 1,n = 1;
        System.out.println(findMax(strs, m, n));
    }
}
