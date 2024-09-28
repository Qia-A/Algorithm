package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2022省赛   刷题统计
 * @author QIA
 * @create 2023-03-23-10:22
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        // 每周做的题目数量
        long week = a*5 + b*2;
        // 周数
        long weekCnt = n / week;
        // 天数
        long count = weekCnt * 7;
        // 剩下不足一周的数量
        n %= week;

        for (int i = 1; i <= 7; i++) {
            if(i <= 5 && n >0) {
                n -= a;
                count++;
            }else if(i > 5 && n > 0){
                n -= b;
                count++;
            }
        }
        System.out.println(count);
    }
}
