package Competition.lanqiao.lqTest.Test3;

import java.util.Scanner;

/**
 * 动态规划   2013   国赛
 * 格子刷油漆
 * @author QIA
 * @create 2023-03-27-9:53
 */
public class Demo03 {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n + 1];
        long sum;
        a[1] = 1; a[2] = 6;b[1] = 1;
        for (int i = 2; i <= n; i++) {
            b[i] = 2 * b[i-1] % mod;
        }
        for (int i = 3; i <= n; i++) {
            a[i] = (2*a[i-1] + b[i]+4*a[i-2])%mod;
        }
        sum = (4 * a[n]) % mod;
        for (int i = 2; i < n; i++) {
            sum += ((2*2*a[n-i]*2*b[i-1])%mod + (2*2*a[i-1]*2*b[n-i]%mod)) % mod; // 这里记得都要取余
            sum %= mod;
        }
        System.out.println(sum);
    }
}
