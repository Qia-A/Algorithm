package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 质数数目
 * @author QIA
 * @create 2025-04-10-0:19
 */
public class Main75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 2;
        if (n==1) {
            System.out.println(0);
        }
        else if (n==2) {
            System.out.println(1);
        }
        else if (n==3) {
            System.out.println(2);
        }
        else {
            for (int i = 4; i <= n; i++) {
                if (prime(i)) sum++;
            }
            System.out.println(sum);
        }
    }

    public static boolean prime(int k){
        for (int i = 2; i < k; i++) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
