package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.*;

/**
 * Dijkstra 算法
 * 思路：
 * 这道题可以用 Dikstra 算法来求解。Dikstra 算法的基本思想是:
 * 每次从未确定最短路径的点中选择一个距离最短的点，然后以该点为中心进行扩展，最终得到所有点的最短路径。
 * 具体来说，我们可以使用一个小根堆来存储当前已经找到了最短路径的点。
 * 每次从小根堆中弹出距离最近的点 然后以 为起点，更新所有与之相连的点的距离，
 * 将这些点插入小根堆中，直到小根堆为空为止。
 * 在更新点的距离时，我们需要使用一种松弛策略，即如果当前点 u 可以通过 u -> v 边到达 v，
 * 并且 u 到 v 的距离加上 u 的最短路径距离比 v 的最短路径距离更小，则更新 v 的最短路径距离。
 * 最后得到的数组 dis 即为从源点到其他点的最短路径。如果某个点到源点没有路径，则 disi = -1
 * 下面是具体的实现方法:
 * 1. 定义一个二维数组 g ，用来存储邻接矩阵。如果点 i 和点 j 之间有一条边，
 * 则 g[i][j] 为该边的长度，否则 g[i][j] = oo。
 * 2. 定义一个数组 dis，用来存储源点到每个点的最短路径。初始时，将 dis 数组的所有元素都赋值为 +oo，
 * 并将 dis 数组的第一个元素设为 0 。
 * 3. 定义一个小根堆 heap, 用来存储当前已经找到了最短路径的点。将源点 1 插入小根堆中。
 * 4. 不断从小根堆中弹出距离最近的点 u，然后以 u 为起点，更新所有与之相连的点 v 的距离，并将这些点插入小根堆中。
 * 具体来说，遍历 u 所有的邻居 v，如果 disv, > disu + g[u][v]，则更新 disv 为 disu + g[u][v]，并将 v 插入小根堆中。
 * 5. 不断执行步骤 4 直到小根堆为空。
 * 6. 输出 dis 数组中所有的元素。如果某个元素为 +oo ，则输出 -1。
 * @author QIA
 * @create 2023-04-05-1:53
 */
public class _10蓝桥王国 {
    static final long inf = 0x3f3f3f3f3f3f3f3fL;
    static final int num = 300005;

    static class Edge {
        int from;
        int to;
        long w;
        Edge(int a, int b, long c) {
            from = a;
            to = b;
            w = c;
        }
    }

    static class SNode implements Comparable<SNode> {
        int id;
        long nDis;
        SNode(int b, long c) {
            id = b;
            nDis = c;
        }

        public int compareTo(SNode a) {
            return Long.compare(nDis, a.nDis);
        }
    }

    static int n, m;
    static ArrayList<Edge>[] e = new ArrayList[num];
    static long[] dis = new long[num];

    static void dijkstra() {
        int s = 1;
        boolean[] done = new boolean[num];
        PriorityQueue<SNode> Q = new PriorityQueue<>();
        Arrays.fill(dis, inf);
        dis[s] = 0;
        Q.add(new SNode(s, dis[s]));
        while (!Q.isEmpty()) {
            SNode u = Q.poll();
            if (done[u.id]) continue;
            done[u.id] = true;
            for (int i = 0; i < e[u.id].size(); i++) {
                Edge y = e[u.id].get(i);
                if (done[y.to]) continue;
                if (dis[y.to] > y.w + u.nDis) {
                    dis[y.to] = y.w + u.nDis;
                    Q.add(new SNode(y.to, dis[y.to]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) e[i] = new ArrayList<>();
        while (m-- > 0) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            e[u].add(new Edge(u, v, w));
        }

        dijkstra();

        for (int i = 1; i <= n; i++) {
            if (dis[i] >= inf) System.out.print("-1");
            else System.out.print(dis[i] + " ");
        }
    }
}
