package LiKou.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 排序
 * 力扣506 相对名次
 * https://leetcode.cn/problems/relative-ranks/
 *
 * 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
 * 运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
 * 名次第 1 的运动员获金牌 "Gold Medal" 。
 * 名次第 2 的运动员获银牌 "Silver Medal" 。
 * 名次第 3 的运动员获铜牌 "Bronze Medal" 。
 * 从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
 * 使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
 *
 * @author QIA
 * @create 2022-11-13-14:11
 */
public class demo08 {
    public static String[] findRelativeranks(int[] score){
        //思路：进行遍历，判断前三名的下标分别赋值三个字符串，第四名往后为他们的编号

        //把前三等奖赋值进去
        String[] desc = {"Gold Medal","silver Medal","Bronze Medal"};
        //定义二维数组，用于存在数组内容及下标
        int[][] arr = new int[score.length][2];
        for (int i = 0; i < score.length; ++i) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        //以行为整体 按指定列比较
        Arrays.sort(arr,(a, b) -> b[0] - a[0]);
        //
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; ++i) {
            if(i >= 3){
                ans[arr[i][1]] = Integer.toString(i + 1);
            } else {
                ans[arr[i][1]] = desc[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //测试用例
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeranks(score)));
    }
}
