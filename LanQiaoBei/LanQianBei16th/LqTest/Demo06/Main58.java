package LanQianBei16th.LqTest.Demo06;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 1216  走迷宫
 * @author QIA
 * @create 2025-04-04-12:23
 */
public class Main58 {
    //建立一个表示上下左右的数组
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { -1, 0, 1, 0 };
    //标记访问
    static int[][] vis;
    //输入数组长度
    static int n, m;
    //起点和终点
    static int x1, y1, endx, endy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 表示行列
        n = sc.nextInt();
        m = sc.nextInt();
        // 矩阵内的障碍物和道路
        int[][] arr =new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        endx = sc.nextInt();
        endy = sc.nextInt();

        vis = new int[n][m];
        sc.close();

        // 调用bfs输出结果
        System.out.println(bfs(arr, x1-1,y1-1));
    }

    public static int bfs(int[][] arr, int x,int y){
        // 建立一个queue ArrayDaque数组q
        Queue<int[]> q = new ArrayDeque<>();
        // 为数组q添加数据， 数据为一个数组poll[0]为x,[1]为y，[2]为steps步数
        // 记录一次后面有迭代一直执行记录每一次的起点知道达到end停止，所以停止条件要放在执行语句前面
        q.offer(new int[] {x,y,0});

        // 判断里面有数及队列不为空 为 最后走不出去考虑
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int x1 = poll[0];
            int y1 = poll[1];
            int steps = poll[2];
            // 终止条件
            if (x1 == endx-1 && y1 == endy-1){
                return steps;
            }
            // 行走路线
            for (int i = 0; i < 4; i++) {
                // 结合dx，dy看xx， yy记录的当前位置的前后左右的坐标位置方便后面遍历判断
                int xx= x1 + dx[i];
                int yy = y1 + dy[i];
                // 首先先标记xx和yy不能超出数组范围，然后这个vis， 标记是否走过， arr是来记录这里没有障碍物可以行走
                if (xx >= 0 && yy >= 0 && xx < n && yy < m && vis[xx][yy] == 0 && arr[xx][yy] == 1) {
                    vis[xx][yy] = 1; //对于符合以上条件的标记走过
                    q.offer(new int[] {xx, yy, steps+1}); // 然后再次调用本方法极地诡发散开
                    // 直到第一个if满足条件停，或者是不满足第二给if停
                    // 到最后第二个给if不满足因为当前的数据被去出了，后面也没有数据的while停止输出-1
                }
            }
        }
        return -1;
    }
}
