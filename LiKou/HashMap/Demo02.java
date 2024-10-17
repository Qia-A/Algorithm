package Contest_23.LiKou.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 力扣 四数相加 ||   哈希
 * 链接：https://leetcode.cn/problems/4sum-ii/
 * 题目：给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ,
 * 请你计算有多少个元组 (i, j, k, l) 能满足：
 *      0 <= i, j, k, l < n
 *      nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 *
 * 输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * 输出：2
 * @author QIA
 * @create 2023-02-15-20:08
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要输入的数字个数：");
        int count = s.nextInt();
        int n = count/4;
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n];
        int[] nums4 = new int[n];
        System.out.println("请输入数据：");
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (i < count/4){
                nums1[num] = s.nextInt();
            } else if (i >= count/4 && i < count/2) {
                nums2[num] = s.nextInt();
            } else if (i >= count/2 && i < count-count/4){
                nums3[num] = s.nextInt();
            } else {
                nums4[num] = s.nextInt();
            }
            num++;
            if (num % 2 == 0) num = 0;
        }

        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        int res = 0;
        // 统计两个数组中的元素之和，同时统计出现的次数，放入map
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        // 统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数。
        for (int i : nums3) {
            for (int j : nums4) {
                temp = i + j;
                if (map.containsKey(0 - temp)) {
                    res += map.get(0 - temp);
                }
            }
        }
        return res;
    }
}
