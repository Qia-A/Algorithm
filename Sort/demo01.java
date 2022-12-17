package LiKou.Sort;

import java.util.Arrays;

/**
 * 排序
 *力扣268.丢失的数字
 * 题目：给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * https://leetcode.cn/problems/missing-number/
 *
 * @author QIA
 * @create 2022-11-10-23:43
 */
public class demo01 {
    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i)){
                return i;
            }
            ++s;
        }
        return s;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {0};
        System.out.println(missingNumber(nums));
    }
}
