package LanQianBei16th.LqTest.Demo03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 24.机器人的运动范围
 * BFS 广度优先搜索
 * ACwing
 * @author QIA
 * @create 2025-03-13-14:16
 */
public class Main29_BFS {

    // Node类作为点的封装，包含x，y横纵坐标的属性
    static class Node {
        int x;
        int y;
        public Node(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 返回res 表示最终结果
    public static int MovingOn(int threshold, int rows, int cols) {
        if (rows == 0 && cols == 0) return 0;
        int res = 1;
        // move数组表示向右，下，左，上前进一格。
        int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};
         // book数组，0表示没走出，1表示走过。
        int[][] book = new int[rows][cols];
        // 机器人从(0,0)开始出发
        book[0][0] = 1;
        // 创建新的队列，用于记录机器人的坐标
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0,0));

        // 当队列不为空时，也就是说机器人还有符合条件未抵达的坐标
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            // 遍历上下左右四个方向，nx和ny记录坐标
            for (int i = 0; i < 4; i++) {
                int nx = node.x + move[i][0];
                int ny = node.y + move[i][1];
                // 判断坐标是方格内的，且未到达过，且行列的数位之和<=k
                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && book[nx][ny] == 0 && check(threshold,nx,ny)){
                    res++;
                    queue.offer(new Node(nx,ny));
                    book[nx][ny] = 1;
                }
            }
        }
        return res;
    }

    // 判断行列坐标的每位数之和是否大于k，是就返回ture，反之false
    static boolean check(int k, int i, int j) {
        int res = 0;
        while (i != 0) {
            res+= (i % 10);
            i /= 10;
        }
        while (j != 0){
            res += (j % 10);
            j /= 10;
        }
        return res <= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入格子大小m,n，以及横纵坐标之数位和小于等于k
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(MovingOn(k,m,n));
    }
}
