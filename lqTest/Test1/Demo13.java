package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 模拟  饮料换购
 * 题目描述：乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊C型饮料，凭3个瓶盖可以再换一瓶C型饮料，并且可以一直循环下去(但不允许暂借或赊账)。
 *    请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的 n 瓶饮料，最后他一共能喝到多少瓶饮料。
 * 输入描述：
 *    输入一个整数n(0<n<1000)，表示开始购买的饮料数量。
 * 输出描述：
 *    输出一个整数，表示实际得到的饮料数
 * 输入输出样例：
 *    输入：100   输出：149
 * 运行限制
 *    最大运行时间：1s
 *    最大运行内存：256M
 * @author QIA
 * @create 2023-03-09-0:51
 */
public class Demo13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        while (n/3 != 0){
            num += n / 3;
            n = (n%3) + (n/3);
        }
        System.out.println(num);
    }
}
