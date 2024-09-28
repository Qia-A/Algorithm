package Competition.lanqiao.LQB.十二.省;

/**
 * 十二届 省赛 Java C组 试题E: 路径
 * 题目：小蓝学习了最短路径之后特别高兴，他定义了一个特别的图，希望找到图 中的最短路径。
 * 小蓝的图由 2021 个结点组成，依次编号 1 至 2021。
 * 对于两个不同的结点 a, b，如果 a 和 b 的差的绝对值大于 21，则两个结点 之间没有边相连；如果 a 和 b 的差的绝对值小于等于 21，则两个点之间有一条 长度为 a 和 b 的最小公倍数的无向边相连。
 * 例如：结点 1 和结点 23 之间没有边相连；结点 3 和结点 24 之间有一条无 向边，长度为 24；结点 15 和结点 25 之间有一条无向边，长度为 75。
 * 请计算，结点 1 和结点 2021 之间的最短路径长度是多少。
 * 运行限制：
 *      最大运行时间：1s
 *      最大运行内存: 128M
 *
 * @author QIA
 * @create 2023-03-03-1:22
 */
public class Demo03 {
    public static void main(String[] args) {
        int n = 2022;
        int[] q = new int[n];
        q[1] = 0;
        for (int i = 2;i <= 2021; i++) {
            q[i] = Integer.MAX_VALUE;
        }
        // dp
        // 当前 q[j] 表示 从 1~j 的最短距离
        // q[j] 可以是 当前 1~j 的最短距离 或者 前一状态 到 该点的最短距离
        for (int i = 1; i <= 2020; i++) {
            for (int j = i+1; j <= 2021 && (j-i <= 21); j++) {
                q[j] = Math.min(q[j], q[i] + le(i, j));
            }
        }
        System.out.println(q[2021]);
    }
    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a%b): a;
    }

    public static int le(int a, int b) {
        return a*b/gcd(a,b);
    }
}
