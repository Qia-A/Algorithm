package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 动态规划、二分查找
 * 思路：
 * 对于一个数列 a，其最长上升子序列长度可以用动态规划求解。
 * 设 dp[i] 表示以 ai结尾的最长上升子序列长度，则状态转移方程为: dp[i] = max (dp[j] + 1)
 * 意思是考虑以 ai 结尾的最长上升子序列，枚举前面所有小于 ai 的数 aj，找到以结尾的最长上升子序列长度 dp[j]，
 * 然后再加上ai，即 dp[j] + 1，得到以 ai 结尾的上升子序列长度。最后再从所有的 dp[i] 中取最大值即可。
 * 时间复杂度为 O(N2)，可以通过本题。如果要优化时间复杂度，可以使用二分查找优化为 O(Vlog N)。
 * 具体来说，可以维护一个长度为 k 的上升子序列 s ，并且 s[k] 表示所有长度为 k 的上升子序列中，最小的以s[k] 结尾的数的值。
 * 例如，对于序列[1,4,2,3]，s = [1,2,3] ，因为所有以 3 结尾的上升子序列中，最小的是[1,2,3]。
 * 接下来考虑如何利用这个信息来进行二分查找。
 * 首先， s 是一个递增序列。其次，s 中元素的个数就是当前最长上升子序列长度.
 * 对于一个数ai，若ai > s[k]，则 ai 可以接在 s 的末尾，形成一个更长的上升子序列。
 * 更新 s 时，只需将ai插入到 s 中合适的位置即可.
 * 若 ai< s[k]  ，则可以用二分查找在 s 中找到第一个大于等于 ai 的位置 p，然后用 ai 更新 sp。
 * 这样虽然不定能形成一个更长的上升子序列，但是能够保证 s 中元素的值更小，方便后面的更新。
 * 最后，最长上升子序列的长度就是 s 的长度。
 * 时间复杂度为 O(Nlog N)。
 * @author QIA
 * @create 2023-04-04-10:56
 */
public class _6蓝桥骑士 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // 用于存放递增序列
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 判断是否为空  或者 移除链表长度-1的值
            if(S.isEmpty() || a[i] > S.get(S.size() - 1)) {
                S.add(a[i]);
            } else {
                // 二分查找 实现 compareTo 方法，不仅仅用于排序，同时也起到equal的作用
                int j = Collections.binarySearch(S, a[i]);
                if (j < 0) {
                    j = -j - 1;
                }
                // set() 方法用于替换动态数组中指定索引的元素。
                S.set(j, a[i]);
            }
        }
        System.out.println(S.size());
    }
}
