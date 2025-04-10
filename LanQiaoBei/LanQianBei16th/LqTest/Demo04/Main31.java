package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 19714  数字诗意
 * @author QIA
 * @create 2025-03-17-20:51
 */
public class Main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 一个数为至少两个连续整数相加得到的数，它一定不是2的幂。
        int count = 0;
        for (int i = 1; i <= n; i++) {
            long j = sc.nextLong();
            while (j % 2 ==0 && j > 1) {
                j /= 2;
            }
            if (j == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
