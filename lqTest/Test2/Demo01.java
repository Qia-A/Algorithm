package Competition.lanqiao.lqTest.Test2;

import java.util.*;

/**
 * 2017 省赛 日期问题
 * 题目：小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
 * 更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应
 * 比如02/03/04，可能是2002 年03月04日、2004年02月03日或2004年03月02日。
 * 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗?
 * 输入描述：
 * 一个日期，格式是"AA/BB/CC"(<A,B,C<9)。
 * 输出描述：
 * 输出若干个不相同的日期，每个日期一行，格式是“yyyyMM-dd”。多个日期按从早到晚排列。
 * 运行限制：
 *   最大运行时间：1s
 *  最大运行内存: 256M
 *
 * @author QIA
 * @create 2023-03-19-22:09
 */
public class Demo01 {
    public static void one(int y,int m,int d){
        int year=y+(y<60?2000:1900);
        month[1]=((year%4==0&&year%100!=0)||year%400==0)?29:28;
        if(m<13&&m>0&&d>0&&d<=month[m-1]){
            System.out.println(year+"-"+(m<10?"0"+m:m)+"-"+(d<10?"0"+d:d));
        }
    }
    public static int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ss[]=s.split("/");
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.valueOf(ss[i]);
        }
        one(arr[0],arr[1],arr[2]);
        one(arr[2],arr[0],arr[1]);
        one(arr[2],arr[1],arr[0]);
    }
}
