package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 题目：小明决定从下周一开始努力刷题准备蓝桥杯竞赛。他计划周一至周五每天做a道题目, 周六和周日每天做b道题目。
 * 请你帮小明计算, 按照计划他将在第几天实现做题数大于等于n题?
 * 输入格式：输入一行包含三个整数a,b和n。
 * 输出格式：输出一个整数代表天数
 * 样式输入：10 20 99
 * 样式输出：8
 *
 * @author QIA
 * @create 2022-12-17-14:16
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long n = s.nextLong();
        long count = 0;
        long day = 0;

        //count < n;
        while(count < n){
            day++;
            if(day%6==0 || day%7==0){
                count += b;
            }else{
                count += a;
            }
        }
        System.out.println(day);
        s.close();
    }
}
