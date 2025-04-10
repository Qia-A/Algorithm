package LanQianBei16th.XiaoSai.fuXi;

import java.util.Scanner;

/**
 * 提示用户输人两个点(x1，y1)和(x2，y2)，然后显示两点间的距离。
 * 计算两点间距离的公式是、(x-x)+(%-y)。
 * 注意:可以使用Math.pow(a,0.5)来计算√a。
 * @author QIA
 * @create 2024-11-30-12:08
 */
public class Main02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("输入x1和y1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("输入x2和y2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double l = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5);
        System.out.println("两点之间的距离为："+l);
    }
}
