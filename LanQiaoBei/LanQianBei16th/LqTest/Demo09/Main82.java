package LanQianBei16th.LqTest.Demo09;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-04-10-23:36
 */
public class Main82 {
    static int N = 1000010;
    static int res = 0;
    static boolean[] st = new boolean[N];
    static int[] prime = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve(sc.nextInt());
        System.out.println(res);
    }

    static void sieve(int n) {
        for (int i = 2; i <= n; i++) {
            if (st[i]) continue; // 如是合数，跳过
            for (int j = 2*i; j <= n; j+=i) {
                st[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!st[i]) prime[res++]=i;
        }
    }
}
