package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;

/**
 * 蓝桥村的真相
 * @author QIA
 * @create 2025-02-25-22:03
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] Result = new long[T];
        for (int i = 0; i < T; i++) {
            long k = sc.nextLong();
            if (k%3 != 0) {
                Result[i] = k;
            }else {
                long s = k/3;
                Result[i] = k+s*3;
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println(Result[i]);
        }
    }
}
