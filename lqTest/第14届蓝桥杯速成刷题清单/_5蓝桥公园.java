package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.*;
/**
 * Floyd算法
 * 思路：
 * 这道题可以用 Floyd 算法求解最短路。
 * 由于 Floyd 算法的时间复杂度为 O(n3次方，因此当 n 较大时会超时，但是对于本题中的 n<400，Floyd 算法足以通过此题。
 * Floyd 算法的基本思路是: 对于图中的任意两个点 i 和 j，我们用 dist[i][j] 表示从 i到j 的最短距离。
 * 初始时，对于所有的 1 <= i,j <= n,有 dist[i][j] = 无穷，如果存在边 (i,j)，则 dist[i][j] = w(i,j)。
 * 然后,我们利用动态规划思想逐步优化 dist 数组，使得 dist[i][j] 逐步近真实的最短路径长度.
 * 具体来说，我们维护一个二维数组 dist，dist[i][j] 表示从 i 到 j 的最短路径长度。初始时，如果有边(i,j)则 dist[i][j] 的初始值为 (i,j)的权值，否则 dist[i][j] = 无穷。
 * 接下来，我们考虑从 1 到 n 的每个点作为中转点，更新所有可能的最短路径长度。
 * 具体来说，对于中转点 k，我们遍历所有的 i,j，如果dist[i][j] > dist[i][k] + dist[k][j]，则更新 dist[i][j] = dist[i][k] + dist[k][j]。
 * 最终得到的 dist 数组即为所有点对之间的最短路径长度。
 * 在实现中，我们可以使用一个三重循环，依次枚举中转点 k 和每对起点 i 和终点 j，并更新 dis[i][j] 的值.
 *
 * @author QIA
 * @create 2023-04-03-1:40
 */
public class _5蓝桥公园 {
    static final long INF = 0x3f3f3f3f3f3f3f3fL;
    static final int MAXN = 410;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[][] dist = new long[MAXN][MAXN];
        int n = scan.nextInt(), m = scan.nextInt(), q = scan.nextInt();
        for (int i = 1; i <= n; ++i) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        for (int i = 1; i <= m; ++i) {
            int u = scan.nextInt(), v = scan.nextInt();
            long w = scan.nextLong();
            dist[u][v] = Math.min(dist[u][v], w);
            dist[v][u] = Math.min(dist[v][u], w);
        }

        // FLoyd 算法
        for (int k = 1; k <= n; ++k) {
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        // 查询
        while (q-- > 0) {
            int st = scan.nextInt(), ed = scan.nextInt();
            if (dist[st][ed] >= INF) {
                System.out.println("-1");
            } else {
                System.out.println(dist[st][ed]);
            }
        }
        scan.close();
    }
}
