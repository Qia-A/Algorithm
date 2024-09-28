package Competition.LuoGu.chuanzhibei;

import java.util.Scanner;

/**
 * 传智杯
 *  课程报名
 * 题目：
 *  智播客推出了一款课程，并进行了一次促销活动。具体来说就是课程的初始定价为v元；每报名m个学员，课程的定价就要提升a元。
 *  由于课程能够容纳的学生有限，因此报名到n人的时候就停止报名。
 *
 * @author QIA
 * @create 2022-11-18-20:20
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        int m = s.nextInt();
        int a = s.nextInt();
        int count = m,sum = 0;

        for (int i = 1;i <= n;i++){
            if (i - count > 0){
                count += m;
                v += a;
            }
            sum += v;
        }
        System.out.println(sum);
    }
}
