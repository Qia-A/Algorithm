package LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣908 最小差值|
 * https://leetcode.cn/problems/smallest-range-i/submissions/
 * 给你一个整数数组nums，和一个整数k。
 * 在一个操作中，您可以选择0<=i<nums.length的任何索引i。将nums[i]改为nums[i]+x，
 * 其中x是一个范围为[-k,k]的整数。对于每个索引i，最多只能应用一次此操作。
 * nums的分数是nums中最大和最小元素的差值。
 * 在对nums中的每个索引最多应用一次上述操作后，返回nums的最低分数 。
 *
 * @author QIA
 * @create 2022-11-18-0:53
 */
public class Demo12 {
    public static int smallestRangeI(int[] nums,int k) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];//最大值
        int min = nums[0];//最小值
        int res = max - min - 2*k;//求差值
        if(res > 0){
            return res;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {0,10};
        int k = 2;
        System.out.println(smallestRangeI(nums, k));
    }
}
