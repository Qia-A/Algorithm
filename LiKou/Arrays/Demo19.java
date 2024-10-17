package Contest_23.LiKou.Arrays;

import java.util.Arrays;

/**
 * 力扣977 有序数组的平方
 * 链接：https://leetcode.cn/problems/squares-of-a-sorted-array/
 * 题目：给你一个按非递减顺序排序的整数数组 nums，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100] 排序后，数组变为 [0,1,9,16,100]
 *
 * @author QIA
 * @create 2022-12-19-23:46
 */
public class Demo19 {

    public static void main(String[] args) {
        int nums[] = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        //双指针
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的，需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }
}
