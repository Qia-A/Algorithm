package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 19712  数字接龙
 * @author QIA
 * @create 2025-03-19-12:27
 */
public class Main38 {
    // 八个方向
    static int[][] direction = new int[][]{
            {0,-1,0},  // 上
            {1,-1,1}, // 右上
            {1,0,2},  // 右
            {1,1,3},  // 右下
            {0,1,4},  // 下
            {-1,1,5}, // 左下
            {-1,0,6}, // 左
            {-1,-1,7}, // 坐上
    };
    static String[][] hash;
    static int N;
    static int K;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new int[N+1][N+1];
        hash = new String[N+1][N+1];
        // 表示棋盘内的数字
        for (int i = 1;i <= N; i++){
            for (int j = 1; j <= N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        // 至此准备工作已完成
        if (!dfs(1,1,graph[1][1],"")) System.out.println("-1");

    }

    public static boolean dfs(int x,int y, int k, String str) {
        if (x == N && y == N && str.length() == N * N - 1) {
            System.out.println(str);
            return true;
        }
        for (int[] ints : direction) {
            int X = x + ints[1];
            int Y = y + ints[0];
            //边界判断
            if (X == 0 || Y == 0 || X == N + 1 || Y == N + 1) continue;
            //判断是否连续 且 判断下一个位置是否已被访问过
            if (graph[X][Y] != (k + 1) % K || hash[X][Y] != null) continue;
            // 复合边界条件且下一个位置没被访问过且连续
            if ((X == x || Y == y)||!(check(x, Y, "" + X + y) || check(X, y, "" + x + Y))) {
                // 水平或垂直
                hash[x][y] = "" + X + Y;
                if (dfs(X, Y, (k + 1) % K, str + ints[2])) return true;
                hash[x][y] = null;
            }
        }
        return false;
    }

    public static boolean check(int x, int y, String re) {
        if (hash[x][y] == null) return false;
        else if (hash[x][y].equals(re)) return true;
        return false;
    }
}
