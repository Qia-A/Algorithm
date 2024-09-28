package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2022 省赛 修剪灌木
 * @author QIA
 * @create 2023-03-20-21:28
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Math.max(i*2,2*(n-i-1)));
        }
        sc.close();
    }
}
