package Contest_23.LiKou.Arrays;

/**
 * 数组 暴力
 * 力扣219 存在重复数组 ||
 * https://leetcode.cn/problems/contains-duplicate-ii/
 * 给你一个整数数组nums和一个整数k，判断数组中是否存在两个 不同的索引i和j，
 * 满足nums[i] == nums[j] 且abs(i-j)<=k。如果存在，返回true；否则，返回false。
 *
 * @author QIA
 * @create 2022-11-16-0:52
 */
public class Demo06 {
    public static boolean containsNearbyDuplicate(int[] nums,int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < i+k+1 && j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
