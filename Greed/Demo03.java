package LiKou.Greed;

/**
 * 贪心算法
 * 力扣45  跳跃游戏 ||
 * https://leetcode.cn/problems/jump-game-ii/
 * 给你一个非负整数数组nums，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 假设你总是可以到达数组的最后一个位置。
 *
 * @author QIA
 * @create 2022-11-22-1:51
 */
public class Demo03 {
    public static int jump(int[] nums){
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
