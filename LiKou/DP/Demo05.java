package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣63  不同路径 ||
 * https://leetcode.cn/problems/unique-paths-ii/
 *
 * 一个机器人位于一个m x n网格的左上角（起始点在下图中标记为“Start”）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用1和0来表示。
 *
 * @author QIA
 * @create 2022-11-23-20:06
 */
public class Demo05  {
    public static int uniquePath(int[][] Grid) {
        if (Grid == null || Grid.length == 0){
            return 0;
        }
        //获取二维数组的长度，定义 dp 数组
        int m = Grid.length,n = Grid[0].length;
        int[][] dp = new int[m][n];
        //初始化第 1 行和第 1 列。
        for (int i = 0; i < m && Grid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n && Grid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }
        //根据状态转移方程 dp[i][j] = dp[i - 1][j] + dp[i][j -1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (Grid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        //测试用例
        int[][] Grid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePath(Grid));
    }
}