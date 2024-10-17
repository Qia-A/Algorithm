package Contest_23.LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣922 按奇偶排序数组 ||
 * https://leetcode.cn/problems/sort-array-by-parity-ii/
 * 给定一个非负整数数组nums，nums中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当nums[i]为奇数时，i也是奇数；当nums[i]为偶数时，i也是偶数。
 * 你可以返回 任何满足上述条件的数组作为答案 。
 *
 * @author QIA
 * @create 2022-11-18-1:09
 */
public class Demo13 {
    public static int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0,j = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                arr[j] = nums[i];
                j += 2;
            }
        }
        for (int i = 0,j = 1; i < nums.length; i++) {
            if(nums[i] % 2 == 1){
                arr[j] = nums[i];
                j += 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

}
