package Competition.lanqiao.LQB.十三.省;

import java.util.Scanner;

/**
 * 十三届 试题C 纸张尺寸
 * 题目描述：在 ISO 国际标准中定义了 A0 纸张的大小为 1189mm x 841mm，将 AO 纸沿长边对折后为 A1 纸，
 *    大小为 841mm x 594mm，在对折的过程中长度直接取下整(实际裁剪时可能有损耗)。
 *    将 A1 纸沿长边对折后为 A2 纸，依此类推。输入纸张的名称，请输出纸张的大小。
 * [输入格式]
 *     输入一行包含一个字符串表示纸张的名称，该名称一定是 AO、A1、A2A3、A4、A5、A6、A7、A8、A9 之一。
 * [输出格式]
 *     输出两行，每行包含一个整数，依次表示长边和短边的长度。
 * 样例输入1： A0   样例输出1： 1189  841
 * 样例输入2： A1   样例输出2： 841   594
 * @author QIA
 * @create 2023-03-06-18:09
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = 1189,wedth = 841;
        String type = s.nextLine();
        char c[] = type.toCharArray();
        int count = 48; // 字符0为48
        while (count < c[1]) {
            length /= 2;
            int temp  = length;
            length = wedth;
            wedth = temp;
            count++;
        }
        System.out.println(length);
        System.out.println(wedth);
    }
}
