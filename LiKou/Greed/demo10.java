package Contest_23.LiKou.Greed;

import java.util.Arrays;

/**
 * 贪心算法
 * 力扣561 数组拆分
 * https://leetcode.cn/problems/array-partition/
 *
 * @author QIA
 * @create 2022-11-08-0:20
 */
public class demo10 {
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i+=2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}
