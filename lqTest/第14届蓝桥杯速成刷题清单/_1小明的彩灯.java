package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 差分数组
 *
 * 地址：https://qej4kkvli6.feishu.cn/docx/UEkTdT43ToGlx1xh6XSctRNUnOh
 * 思路：这道题可以使用差分数组的思想来解决。
 * 对于这道题，我们不需要每次都去遍历整个区间来实现区间加，我们可以使用差分数组来记录每个点与前一个点之间的差值。
 * 也就是说，我们可以通过差分数组d;来实现区间加，可以将区间加的复杂度降为 0(1)。
 * 在区间加的时候，我们只需要将差分数组中的 d 上， d 减去即可。
 * 最后我们可以通过差分数组来还原整个数组。
 * 具体来说，我们可以先用一个长度为 n 的差分数组 来记录相邻两个数之间的差值。
 * 那么初始状态下，对于数组a，有 d =al，d;=ai-ai ( 2<i<n)。
 * 对于一个区间,r 的加操作，我们只需要将 di 加上2，dr+1减去即可。最后，我们可以通过 d 数组求出最终的数组。
 * 具体来说，我们可以使用前缀和的思想，即对于差分数组 d，从 d1 开始，依次累加每个数，得到的就是 a数组。
 * 下面是具体的解题步骤:
 * 1. 构建差分数组 d 。遍历数组 a，计算 d 数组的值，即 di = 1 ，di = ai - ai-1 ( 2<i<n)。
 * 2. 对于每次区间加操作 [l,r,t], 将 di加上，dr+1减去 x。
 * 3.通过差分数组 d，求出最终的数组 a 。从 d1 开始，依次累加每个数，得到的就是 a数组.
 * 时间复杂度分析: (n + g)，其中 n 表示数组长度，q表示操作次数。
 *
 * @author QIA
 * @create 2023-04-02-22:03
 */
public class _1小明的彩灯 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();

        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextLong());
        }

        ArrayList<Long> d = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            d.add((long)0);
        }

        for (int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt(), x = in.nextInt();
            d.set(l, d.get(l) + x);
            if (r < n) {
                d.set(r + 1, d.get(r + 1) - x);
            }
        }

        for (int i = 1; i <= n; i++) {
            d.set(i, d.get(i) + d.get(i - 1));
            a.set(i - 1, a.get(i - 1) + d.get(i));
            if (a.get(i - 1) < 0) {
                a.set(i - 1, (long)0);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }
}
