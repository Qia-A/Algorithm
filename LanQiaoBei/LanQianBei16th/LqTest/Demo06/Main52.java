package LanQianBei16th.LqTest.Demo06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-03-24-20:13
 */
public class Main52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[100010];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int left = k;
        int right = n;
        int ans = -1;
        int mid = 0;
        // 双指针
        while (left <= right) {
            mid = (left + right) /2;
            if (check(a,mid,T,k)) {
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int[] a,int mid,int T,int k){
        long b[] = new long[mid + 5];
        for (int i = 0; i < mid; i++) {
            b[i] = a[i];
        }
        // 只考虑前 mid 名同学的成绩
        Arrays.sort(b,0,mid);
        // 总和
        long sum = 0;
        // 平均数
        double average = 0;
        // 平方和
        long squares = 0;
        // 先计算前 k 个的总和和平方和
        for (int i = 0; i < k; i++) {
            sum += b[i];
            squares += b[i] * b[i];
        }
        average = sum / (double)k;
        // 计算初始方差
        double v = (squares / (double)k) - (average * average);
        // 方差小于给定值，可直接返回答案
        if (v < T) return true;

        // 滑动窗口
        for (int i = k; i < mid; i++) {
            // 计算新的成绩，移除左边的，添加右边的
            sum = sum + b[i] - b[i - k];
            average = sum / (double)k;
            squares += (b[i] * b[i]) - (b[i - k] * b[i - k]);
            // 计算当前窗口的方差
            v = (squares / (double)k) - (average * average);
            if (v < T) return true;
        }
        return false;
    }
}
