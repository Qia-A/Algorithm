package LanQianBei16th.LqTest.Demo05;

import java.util.*;

/**
 * 蓝桥大使【算法赛】
 * @author QIA
 * @create 2025-03-22-18:56
 */
public class Main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = b[i] - a[i];
        }
        sc.close();


        // 小桥去班宣传的酬劳减去小蓝的，并进行排序
        Arrays.sort(c);
        long sum = 0;
        // 将大于的一半累加，剩下的小蓝去宣传
        for (int i = n-1; i >= n/2 ; i--) {
            sum += c[i];
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
