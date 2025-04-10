package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 330 铺设道路
 * @author QIA
 * @create 2025-03-12-12:48
 */
public class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
             sum += Math.max(0,a[i] - a[i-1]);
        }
        System.out.println(sum);
        sc.close();
    }
}
