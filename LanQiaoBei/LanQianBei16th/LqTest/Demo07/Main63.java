package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 * 3677 连续子序列的个数
 * @author QIA
 * @create 2025-04-06-11:07
 */
public class Main63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long m =sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        sc.close();

        long count = 0;  // 存储符合条件的子序列个数
        int l = 0;   // 滑动窗口的左边界
        int sum = 0;  // 当前子序列的和
        for (int i = 0; i < n; i++) {
            sum += arr[i];  // 将当前元素加入到和中
            while (sum >= m) {  // 如果和大于等于 m，调整窗口
                sum -= arr[l];  // 将窗口左边的元素移除
                l++;  // 移动左边界
            }
            count += l; // 记录符合条件的子序列个数
        }
        System.out.println(count);
    }
}
