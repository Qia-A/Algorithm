package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 排序算法
 * 思路：
 * 题目要求我们先输出数组 A 中的元素，从小到大排序；然后再从大到小排序输出。
 * 我们可以使用排序算法来对数组进行排序，然后按照题目要求输出。
 * 具体的解题思路如下:
 * 1. 读入数组 A 的长度 N 和数组 A。
 * 2. 将数组 A 从小到大排序，然后输出。
 * 3. 将数组 A 从大到小排序，然后输出。
 * 具体实现时，可以使用 C++ 的 sort 函数或 Python 的 sorted 函数对数组进行排序。排序后再按照要求输出即可。
 *
 * @author QIA
 * @create 2023-04-04-23:50
 */
public class _8排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        Arrays.sort(a);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
