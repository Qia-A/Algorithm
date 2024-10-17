package Contest_23.LiKou.Arrays;

/**
 *数组
 * 力扣495 提莫攻击
 * https://leetcode.cn/problems/teemo-attacking/
 * 题目：
 * 在《英雄联盟》的世界中，有一个叫“提莫”的英雄。他的攻击可以让敌方英雄艾希（寒冰射手）进入中毒状态。
 * 当提莫攻击艾希，艾希的中毒状态正好持续duration秒。
 * 正式地讲，提莫在t发起攻击意味着艾希在时间区间[t,t + duration - 1]（含t和t+duration-1）处于中毒状态。
 * 如果提莫在中毒影响结束【前】再次攻击，中毒状态计时器将会【重置】，在新的攻击之后，中毒影响将会在duration秒后结束。
 * 给你一个【非递减】的整数数组timeSeries，其中timeSeries[i]表示提莫在timeSeries[i]秒时对艾希发起攻击，以及一个表示中毒持续时间的整数duration。
 * 返回艾希处于中毒状态的总秒数。
 *
 * @author QIA
 * @create 2022-11-15-0:41
 */
public class Demo03 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = duration;//总秒数
        for (int i = 0,j = i+1; j < timeSeries.length; i++,j++) {
            if (timeSeries[j] > (timeSeries[i] + duration)){
                //当第二次攻击已经过了中毒状态时，中毒总秒数为中毒状态二倍
                sum += duration;
            }else{
                sum += (timeSeries[j] - timeSeries[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //测试用例
        //第一秒 提莫攻击艾希并使其中毒；第四秒再次攻击
        int[] timeSeries = {1,4,5,7};
        //中毒状态持续两秒
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}
