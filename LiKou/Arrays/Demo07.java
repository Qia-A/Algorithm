package Contest_23.LiKou.Arrays;

/**
 * 数组
 * 力扣682 棒球比赛
 * https://leetcode.cn/problems/baseball-game/solution/
 * 题目：
 * 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
 * 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表ops，其中ops[i]是你需要记录的第i项操作，ops遵循下述规则：
 * 整数x-表示本回合新获得分数x
 * "+"-表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
 * "D"-表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * "C"-表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * 请你返回记录中所有得分的总和。
 *
 * @author QIA
 * @create 2022-11-16-1:33
 */
public class Demo07 {
    static int[] nums = new int[1010];
    public static int calPoints(String[] ops){
        int n = ops.length,idx = 0;
        for (int i = 0; i < n;i++,idx++) {
            if (ops[i].equals("+")){
                nums[idx] = nums[idx - 1] + nums[idx - 2];
            }else if(ops[i].equals("D")){
                nums[idx] = nums[idx] = nums[idx - 1] * 2;
            }else if(ops[i].equals("C")){
                idx -= 2;
            }else{
                nums[idx] = Integer.parseInt(ops[i]);
            }
        }
        int ans = 0;
        for (int i = 0; i < idx; i++) {
            ans += nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
