package Contest_23.LiKou.HashMap;

import java.util.*;

/**
 * 力扣763 划分字母区间  贪心算法
 * 链接：https://leetcode.cn/problems/partition-labels/
 * 题目：给你一个字符串 s 。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。
 * 注意，划分结果需要满足：将所有划分结果按顺序连接，得到的字符串仍然是 s 。
 * 返回一个表示每个字符串片段的长度的列表。
 * 示例1：
 *  输入：s = "ababcbacadefegdehijhklij"
 *  输出：[9,7,8]
 *  解释：
 *     划分结果为 "ababcbaca"、"defegde"、"hijhklij" 。
 *     每个字母最多出现在一个片段中。
 *     像 "ababcbacadefegde", "hijhklij" 这样的划分是错误的，因为划分的片段数较少。
 * 提示：
 *   1 <= s.length <= 500
 *   s 仅由小写英文字母组成
 * @author QIA
 * @create 2023-01-05-22:02
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        if (s.length() == 0) return res;
        int[] last = new int[26];
        char[] sarr = s.toCharArray();
        for (int i = 0; i < sarr.length; i++) {
            last[sarr[i] - 'a'] = i;
        }
        int left, right = -1;
        while (right < s.length() - 1) {
            left = right + 1;
            right = last[sarr[left] - 'a'];
            int index = left + 1;
            while (index < right) {
                if (last[sarr[index] - 'a'] > right) {
                    right = last[sarr[index] - 'a'];
                }
                index++;
            }
            res.add(right - left + 1);
        }
        return res;
    }
}
