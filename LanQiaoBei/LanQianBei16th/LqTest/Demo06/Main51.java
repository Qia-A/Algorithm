package LanQianBei16th.LqTest.Demo06;

import java.util.Scanner;

/**
 * 3510 冶炼金属
 * @author QIA
 * @create 2025-03-24-19:36
 */
public class Main51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        // 前者表示A,后者表示B
        for (int i = 0; i < N; i++) {
            arr[i][0] =sc.nextInt();
            arr[i][1] =sc.nextInt();
        }
        sc.close();

        int min = 0, max = Integer.MAX_VALUE;
        // 求最大公因数和最小公因数
        for (int i = 0; i < N; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            max = Math.min(max,a/b);
            min = Math.max(min,a/(b+1)+1);
        }
        System.out.println(min +" "+ max);
    }
}
