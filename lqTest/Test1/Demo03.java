package Competition.lanqiao.lqTest.Test1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：给定一个长度为 NN 的数组 AA，
 * 请你先从小到大输出它的每个元素，再从大到小输出它的每个元素。
 * 输入：
 *  第一行包含一个整数N。
 *  第二行包含 NN 个整数 a_1,...,a_na，表示数组 AA 的元素。
 * 输出：输出共两行，每行包含 NN 个整数，表示答案。
 * 输入样例：5
 * 1 3 2 6 5
 * 输出样例：1 2 3 5 6
 * 6 5 3 2 1
 *
 * @author QIA
 * @create 2022-12-20-21:43
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextLong();
        }
        
        //输出
        Arrays.sort(a);
        for (int i = 0;i < a.length;i++) {
            System.out.print(a[Math.toIntExact(i)]+" ");
        }
        System.out.println();
        for (int i = a.length-1;i >= 0;i--) {
            System.out.print(a[Math.toIntExact(i)]+" ");
        }
        s.close();
    }
}
