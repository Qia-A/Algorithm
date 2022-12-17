package LiKou.String;

/**
 * 字符串
 * 力扣205  同构字符串
 * https://leetcode.cn/problems/isomorphic-strings/
 * 题目：
 * 给定两个字符串s和t，判断它们是否是同构的。
 * 如果s中的字符可以按某种映射关系替换得到t，那么这两个字符串是同构的。
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，
 * 相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 *
 * @author QIA
 * @create 2022-11-21-0:28
 */
public class Demo03 {
    public static boolean isIsomorphic(String s,String t){
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] cnt1 = new int[127];
        int[] cnt2 = new int[127];
        int index = 1;
        for(int i = 0; i < chars.length; i++){
            if(cnt1[chars[i]] == 0 && cnt2[chart[i]] == 0){
                cnt1[chars[i]] = index;
                cnt2[chart[i]] = index;
                index++;
            }
            if(cnt1[chars[i]] != cnt2[chart[i]]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //测试用例
        String s = "egg",t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
