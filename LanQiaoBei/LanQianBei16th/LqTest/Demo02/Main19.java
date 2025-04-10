package LanQianBei16th.LqTest.Demo02;

import java.util.Scanner;

/**
 * 核桃
 * @author QIA
 * @create 2025-03-09-18:03
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for (int i = 2;; i++) {
            sum = i;
            if (sum % a == 0&&sum %b == 0&&sum % c == 0)break;
        }
        System.out.println(sum);
    }
}
