package LanQianBei16th.LqTest;

import java.util.Scanner;

/**
 * 测试
 * @author QIA
 * @create 2025-03-05-14:40
 */
public class Test {
    // 暴力法：逐个判断是否为质数
    public static int countPrimesBruteForce(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    // 判断一个数是否为质数
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // 埃拉托色尼筛法
    /**
     * 计算每个数的最小质因数(埃筛法)
     * i从2遍历到x=4009999
     * 例如：2，st[2]为0，si[2]=0,2*2>x基本不可能，所以j=2*2，
     * 刷st[2的所有倍数的最小质因数都为2]，即后面的2的所有倍数都跳过，大大增加效率。
     *
     * 扩展:埃筛法
     * 埃筛法用于快速寻找n以内质数。当n为质数时，它的所有倍数都不为质数，即跳过
     */
    public static int countPrimesSieve(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) isPrime[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] testNs = {10000, 100000, 1000000}; // 测试用的 n 值

        for (int n : testNs) {
            System.out.println("n = " + n);

            long startBrute = System.currentTimeMillis();
            int bruteResult = countPrimesBruteForce(n); // 暴力法
            long endBrute = System.currentTimeMillis();
            System.out.println("暴力法：质数个数 = " + bruteResult + "，耗时：" + (endBrute - startBrute) + " 毫秒");

            long startSieve = System.currentTimeMillis();
            int sieveResult = countPrimesSieve(n); // 埃筛法
            long endSieve = System.currentTimeMillis();
            System.out.println("埃筛法：质数个数 = " + sieveResult + "，耗时：" + (endSieve - startSieve) + " 毫秒");

            System.out.println("-------------------------------");
        }
    }
}

