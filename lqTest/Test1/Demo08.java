package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 算法训练 栈的研究  栈
 * 题目：宁宁考虑的是这样一个问题：一个操作数序列，从1，2，一直到n（图示为1到3的情况），栈A的深度大于n。
 * 　　现在可以进行两种操作，
 * 　　1.将一个数，从操作数序列的头端移到栈的头端（对应数据结构栈的push操作）
 * 　　2. 将一个数，从栈的头端移到输出序列的尾端（对应数据结构栈的pop操作）
 * 　　使用这两种操作，由一个操作数序列就可以得到一系列的输出序列，下图所示为由
 * 　　1 2 3
 * 　　生成序列
 * 　　2 3 1
 * 　　的过程。（原始状态如上图所示）
 * 　　你的程序将对给定的n，计算并输出由操作数序列1，2，…，n经过操作可能得到的输出序列的总数。
 * 输入格式：输入文件只含一个整数
 * 输出格式：输出文件只有一行，即可能输出序列的总数目
 * 样例输出：3
 * 样例输出：5
 *
 * @author QIA
 * @create 2023-02-28-17:38
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] f = new int[30];
        int n = s.nextInt();

        // 初始化
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                f[i] += f[j]*f[i-j-1];
            }
        }
        System.out.println(f[n]);
    }
}
