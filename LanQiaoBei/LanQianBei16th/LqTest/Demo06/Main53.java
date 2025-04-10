package LanQianBei16th.LqTest.Demo06;

import java.util.Scanner;

/**
 * 17148 最长回文前后缀
 * @author QIA
 * @create 2025-03-25-9:43
 */
public class Main53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == s.charAt(n-1-i)) {
            i++;
        }
        int ans = i << 1;
        if (i != n) {
            int len1 = Manacher(s.substring(i));
            int len2 = Manacher(new StringBuilder().append(s, 0, n-i).reverse().toString());
            ans += Math.max(len1, len2) - 1;
        }
        System.out.println(ans);
        sc.close();

    }

    public static int Manacher(String s) {
        char[] chars = build(s);
        int n = chars.length;
        int ans = 0;
        int[] memo = new int[n];
        for (int i = 0,r = 0,c = 0, len; i < n; i++) {
            len = i < r ? Math.min(memo[(c << 1) - i], r-i) : 1;
            while (len+i < n && i-len >= 0 && chars[len+i] == chars[i-len]) {
                len++;
            }
            if (len+i > r) {
                r = len + i;
                c = i;
            }
            memo[i] = len;
            if (memo[i] == i+1) {
                ans = len;
            }
        }
        return ans;
    }

    private static char[] build(String s){
        int n = s.length();
        char[] ans = new char[(n << 1) + 1];
        for (int i = 0; i < n; i++) {
            ans[i << 1] = '#';
            ans[(i << 1) + 1] = s.charAt(i);
        }
        ans[n << 1] = '#';
        return ans;
    }
}
