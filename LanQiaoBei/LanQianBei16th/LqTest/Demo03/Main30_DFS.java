package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 24.机器人的运动范围
 * DFS 深度优先搜索
 * ACwing
 * @author QIA
 * @create 2025-03-13-16:24
 */
public class Main30_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(movingOn(k,m,n));
    }


    // 确定机器人到达的格子
    public static int movingOn(int threshold, int rows, int cols) {
        // 标记机器人已经走过的格子
        boolean[][] flag = new boolean[rows][cols];
        int ans = dfs(threshold, rows, cols, 0, 0, flag);
        return ans;
    }

    // 深度优先搜索
    public static int dfs(int threshold, int rows, int cols, int x, int y, boolean[][] flag) {
        if (x < 0 || y < 0 || x >= rows || y >= cols || sum(x,y) > threshold || flag[x][y]) {
            return 0;
        }
        // 上+下+左+右+起始点
        flag[x][y] = true;
        int up = dfs(threshold, rows, cols, x -1, y, flag);
        int down = dfs(threshold, rows,cols, x  +1, y, flag);
        int left = dfs(threshold, rows, cols, x, y -1, flag);
        int right= dfs(threshold, rows, cols, x, y + 1, flag);

        return up + down + left + right + 1;
    }

    // 横纵坐标的数位之和
    public static int sum(int x, int y){
        int ans = 0;
        while (x > 0 || y > 0) {
            int n1 = x % 10;
            int n2 = y % 10;

            ans += n1 + n2;

            x /= 10;
            y /= 10;
        }
        return ans;
    }
}
