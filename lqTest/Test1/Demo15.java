package Competition.lanqiao.lqTest.Test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * 模拟  外卖店优先级
 * 题目描述："饱了么"外卖系统中维护着 N 家外卖店，编号1~ N。每家外卖店都有 一个优先级，初始时(0 时刻) 优先级都为 0。
 *    每经过 1 个时间单位，如果外卖店没有订单，则优先级会减少 1，最低减 到0;而如果外卖店有订单，则优先级不减反加，每有一单优先级加 2.
 *    如果某家外卖店某时刻优先级大于 5，则会被系统加入优先缓存中;如果 优先级小于等于 3，则会被清除出优先缓存。
 *    给定工时刻以内的 M 条订单信息，请你计算工时刻时有多少外卖店在优 先缓存中?
 * 输入描述：第一行包含 3 个整数 N,M,T
 *    以下 M 行每行包含两个整数 ts,id，表示ts 时刻编号 id 的外卖店收到一个订单其中, 1< N,M,T < 105,1 < ts < T, 1 < id < N
 * 输出描述：输出一个整数代表答案
 * 输入输出样例：
     * 示例：
     * 输入：
     *  2 6 6
     *  1 1
     *  5 2
     *  3 1
     *  6 2
     *  2 1
     *  6 2
     * 输出：1
 * 样例解释：6 时刻时，1号店优先级降到 3，被移除出优先缓存；2号店优先级升到6，
 *    加入优先缓存。所以是有 1 家店(2号)在优先缓存中。
 * 运行限制：
 *     最大运行时间：2s
 *     最大运行内存：256M
 * @author QIA
 * @create 2023-03-09-2:43
 */
public class Demo15 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(bf);

    static int nextInt() throws Exception {
        st.nextToken();
        return (int)st.nval;
    }
    static int n, m, t;
    public static void main(String[] args) throws Exception{

        n = nextInt();
        m = nextInt();
        t = nextInt();

        int[][] flag = new int[m + 1][2];
        int[] last = new int[n + 1];
        int[] size = new int[n + 1];

        boolean[] check = new boolean[n + 1];

        for (int i = 1; i <= m; i++) {
            int a = nextInt();
            int b = nextInt();
            flag[i][0] = a;
            flag[i][1] = b;
        }

        Arrays.sort(flag, (int[] a, int[] b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int i = 1; i <= m; i++) {

            int time = flag[i][0], id = flag[i][1];
            if(time != last[id]) size[id] -= time - last[id] - 1;

            if(size[id] < 0) size[id] = 0;

            if(size[id] <= 3) check[id] = false;

            last[id] = time;
            //
            size[id] += 2;
            if(size[id] > 5) check[id] = true;
        }

        for (int i = 1; i <= n; i++) {
            if(last[i] < t) {
                size[i] -= t - last[i];
                if(size[i] <= 3) check[i] = false;
            }
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            if(check[i]) res++;
        }
        System.out.println(res);

    }
}
