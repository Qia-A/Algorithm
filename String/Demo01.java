package LiKou.String;

/**
 * 字符串
 * 力扣520  检测大写字母
 * https://leetcode.cn/problems/detect-capital/
 * 我们定义，在以下情况时，单词的大写用法是正确的：
     * 全部字母都是大写，比如"USA"。
     * 单词中所有字母都不是大写，比如"leetcode"。
     * 如果单词不只含有一个字母，只有首字母大写，比如"Google"。
 * 给你一个字符串word。如果大写用法正确，返回true；否则，返回false。
 *
 * @author QIA
 * @create 2022-11-20-0:21
 */
public class Demo01 {
    public static boolean detectCapitalUse(String word){
        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            char s = word.charAt(i);
            if (s >= 'A' && s <= 'Z'){
                count++;
            }
        }
        return count == len || count == 0
                || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }

    public static void main(String[] args) {
        //测试用例
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
}
