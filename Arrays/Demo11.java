package LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣905 按奇偶数排序数组
 * https://leetcode.cn/problems/sort-array-by-parity/
 * 给你一个整数数组nums，将nums中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
 * 返回满足此条件的任一数组作为答案。
 *
 * @author QIA
 * @create 2022-11-17-23:59
 */
public class Demo11 {
    public static  int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int p = 0,q = nums.length-1;
        for (int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0){
                arr[p] = nums[i];
                p++;
            }else{
                arr[q] = nums[i];
                q--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
