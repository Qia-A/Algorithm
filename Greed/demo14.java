package LiKou.Greed;

/**
 * 贪心算法
 *
 * @author QIA
 * @create 2022-11-09-11:49
 */
public class demo14 {
    //力扣680  验证回文串II
    //https://leetcode.cn/problems/valid-palindrome-ii/
    public static boolean validPalindrome(String s) {
        int front = 0;
        int end = s.length() - 1;
        // < 符号，中间一个字符不影响回文与否
        while (front < end) {
            if (s.charAt(front) != s.charAt(end)) {
                return validPalindromeHelper(s, front + 1, end) || validPalindromeHelper(s, front, end - 1);
            }
            front++;
            end--;
        }
        return true;
    }

    public static boolean validPalindromeHelper(String s, int front, int end) {
        while (front < end) {
            if (s.charAt(front) != s.charAt(end)) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s = {"abca"};
        System.out.println(validPalindrome(String.valueOf(s)));
    }

}
