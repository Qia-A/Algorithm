package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BFS
 * 思路：这里详细解释一下 BFS 的解题思路。
 * 1. BFS 的思路是从起点出发，按照广度优先的顺序一层一层地扩展节点，直到到达目标节点为止。
 * 在 BFS 中，我1.们需要用一个队列来存储已经被访问但是相邻的节点还没有被访问的节点。
 * 2. 在这道题中，我们可以将迷官看成一个无向图，每个格子为一个节点，如果两个格子相邻且都是道路，则它们之间有一条边。
 * 我们可以将起点加入队列，然后不断地从队列中取出最先加入队列的节点，扩展它的邻居节点，再将这些邻居节点加入队列。
 * 这样，每次取出的节点都是到起点距离最短的节点。如果扩展到终点节点则搜索结束，返回当前节点的距离。
 * 3. 具体地，我们可以使用两个数组 dist 和 visited 来记录节点的距离和是否被访问过。
 * 一开始，起点距离3 为0，其他节点距离为 +0，所有节点都没有被访问过。
 * 每次从队列中取出一个节点时，将它的所有邻居节点加入队列，同时更新这些邻居节点的距离和访问状态。
 * 如果扩展到终点节点，则搜索结束，返回当前节点的距离。如果队列为空仍未扩展到终点节点，则搜索失败，无法从起点到达终点。
 * 4. 因为每个节点最多只被访问一次，所以 BFS 的时间复杂度是 O(NM)，其中 N 是宫的行数, M 是迷官的列数。
 * 空间复杂度也是 O(NM)，需要存储距离和访问状态数组。
 *
 * @author QIA
 * @create 2023-04-03-0:04
 */
public class _3走迷宫 {
    private static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 四个方向

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 迷宫的长
        int m = sc.nextInt(); // 迷宫的宽
        // 存储迷宫坐标，以及障碍物坐标
        int[][] maze = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        // 入口位置 x1, y1
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        // 出口位置 x2, y2
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        int[][] dist = new int[n + 1][m + 1];
        boolean[][] visited = new boolean[n + 1][m + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[0] == endX && cur[1] == endY) { // 如果扩展到终点节点，则搜索结束，返回当前节点的距离
                System.out.println(dist[cur[0]][cur[1]]);
                return;
            }
            for (int[] dir : dirs) { // 扩展当前节点的邻居节点
                int nextX = cur[0] + dir[0];
                int nextY = cur[1] + dir[1];
                if (nextX < 1 || nextX > n || nextY < 1 || nextY > m) {
                    continue;
                }
                if (maze[nextX][nextY] == 0) {
                    continue;
                }
                if (visited[nextX][nextY]) {
                    continue;
                }
                visited[nextX][nextY] = true;
                dist[nextX][nextY] = dist[cur[0]][cur[1]] + 1;
                queue.offer(new int[]{nextX, nextY});
            }
        }
        System.out.println(-1);  // 无法从起点到达终点
    }
}
