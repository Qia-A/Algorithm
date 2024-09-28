package Competition.lanqiao.LQB.十三.省;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-08-17:35
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long y = b - a;
        long mod = a % y, k = 0;
        if (mod != 0) {
            k = y - mod;
        }
        System.out.println(k);
    }
}
