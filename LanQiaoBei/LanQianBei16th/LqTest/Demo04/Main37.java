package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 784 数字游戏
 * @author QIA
 * @create 2025-03-19-12:31
 */
public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') count++;
        }
        System.out.println(count);
    }
}
