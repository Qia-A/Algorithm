package Competition.lanqiao.LQB.十一.国;

import java.util.Scanner;

/**
 * 国赛  试题H：蓝肽子序列
 * 题目：L 星球上的生物由蛋蓝质组成，每一种蛋蓝质由一类称为蓝肤的物资首尾连接成一条长链后折叠而成。
 *      生物学家小乔正在研究工星球上的蛋蓝质。她拿到两个蛋蓝质的蓝脑序列想通过这两条蓝脑序列的共同特点来分析两种蛋蓝质的相似性。
 *      具体的，一个蓝脑可以使用 1 至 5 个英文字母表示，其中第一个字母大写,后面的字母小写。一个蛋蓝质的蓝肤序列可以用蓝肤的表示顺序拼接而成。
 *      在一条蓝肤序列中，如果选取其中的一些位置，把这些位置的蓝肤取出,并按照它们在原序列中的位置摆放，则称为这条蓝脑的一个子序列。蓝肤的子序列不一定在原序列中是连续的，中间可能间隔着一些未被取出的蓝肤。
 *      如果第一条蓝肤序列可以取出一个子序列与第二条蓝肤序列中取出的某个子序列相等，则称为一个公共蓝肤子序列。
 *      给定两条蓝脑序列，找出他们最长的那个公共蓝肚子序列的长度。
 *  输入格式：输入两行，每行包含一个字符串，表示一个蓝肽序列。字符串中间没有空格等分隔字符。
 *  输出格式：输出一个整数，表示最长的那个公共蓝肽子序列的长度
 * 【样例输入】  LanQiaoBei  LanTaiXiaoQiao
 * 【样例输出】  2
 * 【样例说明】  最长的公共蓝肚子序列为 LanQiao，共两个蓝肽。
 * 【评测用例规模与约定】
 *      对于 20% 的评测用例，两个字符串的长度均不超过 20。
 *      对于 50% 的评测用例，两个字符串的长度均不超过 100。
 *      对于所有评测用例，两个字符串的长度均不超过 1000。
 *
 * @author QIA
 * @create 2023-03-13-16:51
 */
public class Demo_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        // 将字符串分割
        String[] split1 = splitStr(str1);
        String[] split2 = splitStr(str2);
        // 动态规划·初始化
        int ans = 0;
        int lens = split1.length, lent = split2.length;
        int[][] dp = new int[lens + 1][lent + 1];
        for (int i = 2; i <= lens; i++) {
            for (int j = 2; j <= lent; j++) {
                if (split1[i - 1].equals(split2[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]);
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        System.out.println(ans);
    }

    private static String[] splitStr(String str) {
        // $0 表示匹配到的第一个字符（即该大写字母）
        // _$0 表示在匹配到的大写字母前加一个下划线（作为分隔符使用）
        String temp = str.replaceAll("[A-Z]", "_$0");
        String[] split = temp.split("_");
        return split;
    }
}
