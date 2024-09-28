package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 位运算
 * 问题描述：请实现一个函数，输入一个整数，输出该数二进制表示中的1的个数。
 *      例如：9的二进制表示为1001，有2位是1
 *
 * @author QIA
 * @create 2023-03-09-0:09
 */
public class Demo11 {
    public static void main(String[] args) {
        //
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String s1 = Integer.toBinaryString(N);
        int num = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch == '1') {
                num++;
            }
        }
        System.out.println(num);
    }
}
