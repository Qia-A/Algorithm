package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 练习题：成绩分析
 *
 * @author QIA
 * @create 2023-03-16-19:19
 */
public class Demo16 {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            if (m > 60){
                a++;
                if(m > 85) {
                    b++;
                }
            }
        }
        System.out.println(Math.round((double)a/n*100) + "%");
        System.out.println(Math.round((double)b/n*100) + "%");
    }
}
