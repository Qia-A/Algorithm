package LanQianBei16th.LqTest.Demo09;

import java.util.Scanner;

/**
 * 求阶乘
 *  满足 ! 的末尾恰好有 个 0 的最小的 是多少?
 * 如果这样的 N 不存在输出  −1 。
 * @author QIA
 * @create 2025-04-10-18:04
 */
public class Main81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * N！是乘积形式，尾数有几个零取决于有几个因数10。
         * 因数10分解成质因数是2*5。由于2的数量肯定大于5，所以本质上是求有几个5。
         * N必须+5才能多一个因数5。但是注意每逢25会额外多一个，逢125再多一个……以此类推
         * 所以我们可以得到一个函数k（n）：
         * k = [n/5] + [n/25] + [n/125] + ... + [n/5^a]，其中 a应该为使得 n > 5^a成立的最大数。其实a取到∞也行，算式后面都是0，不影响和的计算。
         * 因此我们可以通过从0开始遍历N，当k=k（N）时，输出N。如果k(N)>k>k(N-1) 则输出-1
         * 当数据量大时，会出现超时。并且我们不难发现从0开始会出现大量的无效遍历。
         * 因此我们应该调整N的起始位置。
         * 观察公式不难发现 5k ≈ n +[n/5] + [n/25] + ... + [n / 5^(a-1)] = n + k。
         * 所以4k 是接近我们的结果并且一定小于的（因为是向下取整，所以5k - k与不取整比存在数据丢失）
         * 并且注意（第三点也提到），N应该是5的倍数。所以4k还要再向下取最近的5的倍数即4k - 4k%5
         * 也就是我们从K（4K - 4K%5）开始寻找符合条件的K，便可以在限时内完成任务
         */
        long k = sc.nextLong();
        long sum = 0;
        long n =(4*k - 4*k%5);
        for (long temp = n/5; temp > 0; temp /= 5) {
            sum += temp;
        }
        while (sum < k){
            n += 5;
            for (long temp = n; temp % 5 == 0; temp /= 5) {
                sum++;
            }
        }
        if (sum == k) {
            System.out.println(n);
        }else {
            System.out.println(-1);
        }
        sc.close();
    }
}
