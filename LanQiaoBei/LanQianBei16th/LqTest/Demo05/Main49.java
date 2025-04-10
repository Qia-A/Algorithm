package LanQianBei16th.LqTest.Demo05;

import java.util.Scanner;

/**
 * 19709 好数
 * @author QIA
 * @create 2025-03-23-15:53
 */
public class Main49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (pr(i) == 1){
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static int pr(int a) {
        int x = 1;
        while (a != 0){
            int t = a%10;
            // 奇数位上为奇数，偶数位上为偶数
            if (x % 2 == 1){
                if (t % 2 == 0) return 0;
            }else {
                if (t % 2 == 1) return 0;
            }
            x++;
            a /= 10;
        }
        return 1;
    }
}
