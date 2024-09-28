package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 欧几里德定理：
 *     对于不完全为 0 的整数 a，b，gcd（a，b）表示 a，b 的最大公约数。那么一定存在整
 * 数 x，y 使得 gcd（a，b）=ax+by。
 * 扩展：如果有的包子种类的最大公约数不是1 那么凑不出来的情况就有无限多种。
 * 剩下的用完全背包解决
 * dp[i]数组里存放着是数量为i个的包子数能不能被凑出来
 *
 * @author QIA
 * @create 2023-03-23-15:20
 */
public class Demo14 {
    static int n,g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (i == 0){  // 从第一个数开始
                g = a[i];
            }
            g = gcd(g,a[i]); // 和其他笼数看是否互质
        }
        boolean[] dp = new boolean[10001];
        if(g != 1) {
            // 所有系数不互质,解有无数个
            System.out.println("INF");
        } else {
            // 每种笼里面的个数对应的整数倍，都能凑出来
            // 方法一：先用第一笼开始装，在装第二笼，即i=1时，在遍历过程中即有可能会和i= 0时判断的dp[0]进行组合也会和自己的dp[1]进行叠加，以此类推，在后面几笼都会加到前面的dp[]
            for (int i = 0; i < n; i++) {
                dp[a[i]] = true;
                for (int j = 1; j + a[i]< dp.length ; j++) {
                    if(dp[j]) dp[j+a[i]] = true;
                }
            }
            /*
                //方法2：
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j < dp.length; j++) {
                    if (j%a[i]==0) {  //每一笼的倍数必定能够装
                        dp[j]=true;
                    }
                }
            }
            for (int i = 1; i < a.length; i++) {
                for (int j = 1; j < dp.length; j++) {
                    if (dp[j]) {
                        //在能凑出来的情况下，他的下一个能凑出来的个数是
                        //一种笼子里面的包子数加上当前能凑出来的个数是一定能凑出来的
                        if (j+a[i]<dp.length) {
                            dp[j+a[i]]=true;
                        }
                    }
                }
            }
             */
            int ans = 0;
            for (int i = 1; i < dp.length; i++) {
                if (!dp[i]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    // 找出最大公约数方法
    private static int gcd(int a,int b) {
        return b%a == 0 ? a : gcd(b, a%b);
    }
}
