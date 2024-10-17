package Contest_23.LiKou.Greed;

/**
 * 贪心算法
 * 力扣55  跳跃游戏
 * 链接：https://leetcode.cn/problems/jump-game/
 * 给定一个非负整数数组nums，你最初位于数组的第一个下标。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 *
 * @author QIA
 * @create 2022-11-21-23:43
 */
public class Demo02 {
    public static boolean canJump(int[] nums){
        //定义n取数组长度
        int n = nums.length;
        //定义跳跃的步数
        int rightmost = 0;

        for (int i = 0; i < n; i++) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost,i + nums[i]);
                if (rightmost >= n - 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
