package Contest_23.LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣215 数组中的第k个最大元素
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意：【你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。】
 *
 * @author QIA
 * @create 2022-11-18-1:42
 */
public class Demo14 {
    public static int findkthLargest(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findkthLargest(nums, k));
    }
}
