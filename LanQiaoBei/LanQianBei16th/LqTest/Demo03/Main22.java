package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 250 反转字符串中的字符
 * @author QIA
 * @create 2025-03-10-17:08
 */
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i = S.length()-1; i >= 0; i--) {
            System.out.print(S.charAt(i));
        }
    }
}
