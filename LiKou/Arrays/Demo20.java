package Contest_23.LiKou.Arrays;

import java.util.Scanner;

/**
 * 力扣209 长度最小的子数组
 * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum/
 * 题目：给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的连续子数组[numsl,numsl+1,...,numsr-1,numsr]，并返回其长度。如果不存在符合条件的子数组，返回0。
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 *
 * @author QIA
 * @create 2022-12-20-22:03
 */
public class Demo20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result,right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 :result;
    }
}
