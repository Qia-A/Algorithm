package Contest_23.LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组、双指针、异或
 * 力扣136.只出现一次的数字
 * https://leetcode.cn/problems/single-number/
 * 给你一个非空整数数组nums，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 要求：你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 * @author QIA
 * @create 2022-11-14-22:43
 */
public class Demo02 {
    public static int singleNumber(int[] nums){
        //思路：定义number为只出现一次的元素；利用双指针对出现过一次的元素进行标记；依次排除
        //快慢指针：快指针遍历全部，当快指针不等于满指针时，慢指针赋值为number，
        Arrays.sort(nums);
        int number = nums[nums.length - 1];
        for (int i = 0,j = i+1; j < nums.length;) {
            if(nums[i] != nums[j]){
                number = nums[i];
                j++;
            }else if(nums[i] == nums[j]){
                j+=2;
                i+=2;
            }
        }
        return number;
    }

    public static int singleNumber1(int[] nums){
        //异或思路：
        int number = nums[0];
        if (nums.length > 1){
            for (int i = 1; i < nums.length; i++) {
                number ^= nums[i];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,4,2,2};
        System.out.println(singleNumber1(nums));
    }
}
