package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 19718 回文字符串
 * @author QIA
 * @create 2025-03-13-13:27
 */
public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){
            String s = sc.next();
            System.out.println(f(s) ? "Yes" : "No");
        }

        //
    }

    // 判断字符串是否可以成为回文字符串
    public static boolean f(String s) {
        int l = 0;
        int r = s.length() - 1;
        // 当相等的时候即为中间字符
        while (l < r) {
            // 首尾是否相同，相同下一个，不同判断是否为l、q、b；是的话下一个，不是则返回false，不为回文字符串。
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                if (s.charAt(r) == 'l' || s.charAt(r) == 'q' || s.charAt(r) == 'b') {
                    r--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
