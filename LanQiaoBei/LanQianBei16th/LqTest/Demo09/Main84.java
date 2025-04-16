package LanQianBei16th.LqTest.Demo09;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-04-11-21:29
 */

public class Main84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        sc.close();
        int left = 0,right = s.length-1;
        while (left < right) {
            if (s[left] == s[right]) {
                break;
            }
            left++;
            right--;
        }
        if (left >= right) System.out.println("Y");
        else System.out.println("N");
    }
}
