package LiKou.Arrays;

/**
 * 数组
 * 力扣953 验证外星语词典
 * https://leetcode.cn/problems/verifying-an-alien-dictionary/
 * 某种外星语也使用英文小写字母，但可能顺序order不同。字母表的顺序（order）是一些小写字母的排列。
 * 给定一组用外星语书写的单词words，以及其字母表的顺序order，只有当给定的单词在这种外星语中
 * 按字典序排列时，返回true；否则，返回false。
 *
 * @author QIA
 * @create 2022-11-18-16:22
 */
public class Demo18 {

    public static boolean isAlienSorted(String[] words, String order){
        int n = words.length;
        if (n <= 1) {
            return true;
        }
        for (int i = 0; i < n - 1; i++) {
            String word = words[i];
            String word2 = words[i + 1];
            int m = Math.min(word.length(), word2.length());
            int j = 0;
            while (j < m) {
                if (word.charAt(j) != word2.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == m) {
                j--;
            }
            if (word.charAt(j) == word2.charAt(j)) {
                if (word.length() > word2.length()) {
                    return false;
                }
            } else {
                if (order.indexOf(word.charAt(j)) > order.indexOf(word2.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //测试用例
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }
}
