package Competition.lanqiao.LQB.校内模拟赛;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-11-16:21
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        while(k != 0){
            k--;
            if(n > 7){
                n = 1;
            }
            n++;
        }
        System.out.println(n);
    }
}
