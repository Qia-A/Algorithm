package LanQianBei16th.LqTest.Demo05;

import java.util.Scanner;

/**
 * 蓝桥字符【算法赛】
 * @author QIA
 * @create 2025-03-22-18:56
 */
public class Main44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        long countL = 0;
        long countLA = 0;
        long countLAN = 0;

        for (char c : s.toCharArray()){
            if (c == 'l'){
                countL++;
            } else if (c == 'a'){
                countLA += countL;
            } else if (c == 'n') {
                countLAN += countLA;
            }
        }
        System.out.println(countLAN);
    }
}
