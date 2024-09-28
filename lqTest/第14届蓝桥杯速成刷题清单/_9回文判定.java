package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.Scanner;

/**
 *
 * 回文字符串
 * 思路：
 * 当一个字符串正序和反序都一样，那么它就是回文字符串。
 * 我们可以使用双指针的方法来判断一个字符串是否是回文字符串。
 * 具体来说，我们使用两个指针，一个从字符串开头出发，一个从字符串结尾出发，然后两个指针向中间靠拢，
 * 比较它们所指向的字符是否相同，如果都相同，继续比较下一对字符，否则就说明不是回文字符串。
 * 当然，这里要注意一下字符审长度的奇偶性问题。如果字符串长度是奇数，那么中间的那个字符可以忽略不看。
 * 例如，字符串 abcba 的长度是 5，我们只需要比较前两个字符 a 和 b，以及后两个字符 b 和 a 是否相等就可以了。
 * 如果字符串长度是偶数，那么两个指针在最终相遇时指向的是相邻的两个字符，也就是说，
 * 需要比较它们所指向的两个字符是否相等。
 * 通过这种方式，我们可以在 O(n)的时间复杂度内判断一个字符串是否是回文字符串
 *
 * @author QIA
 * @create 2023-04-05-0:38
 */
public class _9回文判定 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("N");
                return ;
            }
            left++;
            right--;
        }
        System.out.println("Y");
    }
}
