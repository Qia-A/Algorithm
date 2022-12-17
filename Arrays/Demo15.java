package LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣287 寻找重复数
 * https://leetcode.cn/problems/find-the-duplicate-number/
 * 给定一个包含n+1个整数的数组nums，其数字都在[1,n]范围内（包括1和n），可知至少存在一个重复的整数。
 * 假设nums只有一个重复的整数，返回这个重复的数。
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
 *
 * @author QIA
 * @create 2022-11-18-2:33
 */
public class Demo15 {
    public static int findDuplicate(int[] nums){
        //快慢指针
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while(pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }

    public static int findDuplicate1(int[] nums){
        //排序
        Arrays.sort(nums);
        int num = nums.length;
        for(int i = 1;i < num;i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate1(nums));
    }
}
