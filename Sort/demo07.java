package LiKou.Sort;

/**
 * 排序
 * 力扣389 找不同
 * https://leetcode.cn/problems/find-the-difference/
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * @author QIA
 * @create 2022-11-12-19:30
 */
public class demo07 {
    public static char findTheDifference(String s,String t){
        //方法一：计数排序
        //时间复杂度：O(N)，其中N为字符串的长度。
        //空间复杂度：O(∣Σ∣)，其中Σ是字符集，这道题中字符串只包含小写字母，∣Σ∣=26。需要使用数组对每个字符计数。
//        int[] cnt = new int[26];
//        for (int i = 0;i <s.length();i++){
//            char ch = s.charAt(i);
//            cnt[ch - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            cnt[ch - 'a']--;
//            if (cnt[ch - 'a'] < 0){
//                return ch;
//            }
//        }
//        return ' ';

        //方法二：求和
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }

    public static void main(String[] args) {
        String s = "abcd",t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
