package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 最大公约数
 * @author QIA
 * @create 2025-04-09-22:40
 */
public class Main72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(number(sc.nextInt(),sc.nextInt()));
        }
        sc.close();
    }

    // 最大公约数   递归
    private static int number(int a, int b) {
        return b == 0 ? a : number(b,a%b);
    }
}
