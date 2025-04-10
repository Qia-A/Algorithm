package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;

/**
 * 每日真题2120纸张尺寸
 * 问题描述
 * 在 ISO 国际标准中定义了 A0 纸张的大小为 1189mm
 * 841mm, 将 A0 纸 沿长边对折后为 A1 纸, 大小为 841mm
 * 594mm, 在对折的过程中长度直接取 下整 (实际裁剪时可能有损耗)。将 A1 纸沿长边对折后为 A2 纸, 依此类推。
 * 输入纸张的名称, 请输出纸张的大小。
 *
 * 输入格式
 * 输入一行包含一个字符串表示纸张的名称, 该名称一定是 A0、A1、A2、 A3、A4、A5、A6、A7、A8、A9 之一。
 *
 * 输出格式
 * 输出两行，每行包含一个整数，依次表示长边和短边的长度。
 * 样例输入：A0
 * 样例输出
 * 1189
 * 841
 * @author QIA
 * @create 2024-11-30-16:34
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zhizhang = sc.nextLine();
        int Long = 1189,Width = 841;
        char c[] = zhizhang.toCharArray();
        for (int i = 48; i < c[1]; i++) {
            Long /= 2;
            int temp = Long;
            Long = Width;
            Width = temp;
        }
        System.out.println(Long);
        System.out.println(Width);
    }
}
