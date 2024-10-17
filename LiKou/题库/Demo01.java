package Contest_23.LiKou.题库;

import java.util.Arrays;

/**
 * 189.轮转数组
 * 链接：https://leetcode.cn/problems/rotate-array/
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
 * 示例1:
 *      输入:nums = [1,2,3,4,5,6,7]，k = 3
 *      输出:[5,6,7,1,2,3,4]
 * 解释:
 *      向右轮转 1 步: [7,1,2,3,4,5,6]
 *      向右轮转 2 步: [6,7,1,2,3,4,5]
 *      向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例2:
 *      输入:nums = [-1,-100,3,99]，k = 2
 *      输出:[3,99,-1,-100]
 * 解释:
 *      向右轮转 1 步: [99,1,-100,3]
 *      向右轮转 2 步: [3,99,1,-100]
 * 提示:
 *      1 <= nums.length <= 10 5
 *      -2 31<= nums[i] <= 231 - 1
 *      0 <= k <= 105
 * @author QIA
 * @create 2023-03-10-17:48
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
