package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣62  不同路径
 * https://leetcode.cn/problems/unique-paths/
 * 一个机器人位于一个m x n网格的左上角（起始点在下图中标记为“Start”）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * 问总共有多少条不同的路径？
 *
 * @author QIA
 * @create 2022-11-23-15:42
 */
public class Demo04 {
    //动态规划
    public static int uniquePaths(int m,int n){
        //该网格大小为m x n,定义动态方程数组大小为m x n
        int[][] dp = new int[m][n];
        //将n为0的一行路径数量为1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        //将m为0的一列的路径数量为1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        //累加从[1-m][1-n]的路径条数;
        for (int i = 1; i < m; i++) {
            for (int j = 1;j < n;j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        //返回总共的路径数量
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        //测试用例
        int m = 3,n = 7;
        System.out.println(uniquePaths(m, n));
    }
}
