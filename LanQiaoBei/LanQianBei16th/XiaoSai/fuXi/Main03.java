package LanQianBei16th.XiaoSai.fuXi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 提示用户输人六边形的边长，然后显示它的面积。
 * 计算六边形面积的公式是:(3*√3*s^2)/2
 * @author QIA
 * @create 2024-11-30-12:18
 */
public class Main03 {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.0000");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();

        double s = (3*Math.pow(3,0.5)*l*l)/2;
        System.out.println("面积为："+d.format(s));

    }
}
