package Contest_23.LiKou.Sort;

import java.util.Arrays;

/**
 * 排序，计数排序
 * 力扣1051.高度检查器
 * https://leetcode.cn/problems/height-checker/
 *
 * 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
 * 排序后的高度情况用整数数组expected表示，其中expected[i]是预计排在这一行中第i位的学生的高度（下标从0开始）。
 * 给你一个整数数组 heights，表示当前学生站位的高度情况。heights[i]是这一行中第i位学生的高度（下标从0开始）。
 * 返回满足heights[i]!=expected[i]的下标数量。
 *
 * @author QIA
 * @create 2022-11-12-13:09
 */
public class demo04 {

    public static int heightChecker(int[] heights) {
        //重新统计排序后的数组，判断下标不同的数量
        int ans = 0;
        int[] expected = new int[heights.length];
        System.arraycopy(heights,0,expected,0,heights.length);
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]){
                ++ans;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        //测试用例
        int[] heights = {5,1,3,2,4};
        System.out.println(heightChecker(heights));
    }
}
