package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.Scanner;

/**
 *
 * 二分法
 * 思路：
 * 1. 首先，我们可以将立方根的求解问题转化为求解一个方程的根。即求解下面这个方程在[0,N]范围内的根:
 *  f(x) = x3-N = 0
 * 2. 由于 f(x)在 [0,N] 范围内是单调递增的，因此我们可以使用二分法来求解方程 f(x) = 0 的根。
 * 3. 二分查找过程中，我们需要不断缩小区间，直到区间长度小于某个阈值(例如 10-8)，此时区间左端点即为方程 f(x) = 0 的近似解，即 N 的立方根。
 * 4. 具体来说，我们可以设要求解的数为 x，二分的区间为 [0,x]。每次二分查找时，我们取区间的中点 mid,
 * 比较 mid3次方和 x 的大小关系,若 mid3次方 < x，则答案在 [mid+1,r] 中，否则答案在 [l,mid] 中。
 * 重复以上过程，直到区间长度小于 10-8次方，此时区间的左端点即为答案。
 *
 * @author QIA
 * @create 2023-04-02-22:29
 */
public class _2解立方根 {
    private static final double EPSILON = 1e-8; // 误差控制

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            double l = 0, r = x;
            while (r - l > EPSILON) {
                double mid = (l + r) / 2;
                if (mid * mid * mid < x) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
            System.out.printf("%.3f\n", l); // 输出答案，保留 3 位小数
        }
    }
}
