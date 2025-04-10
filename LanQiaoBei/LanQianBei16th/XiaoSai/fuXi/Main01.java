package LanQianBei16th.XiaoSai.fuXi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1.提示用户输入体重(以磅为单位)以及身高(以英寸为单位)，然后显示BMI。
 * BIM=体重（公斤）/身高（米）的平方值
 * 注意:一磅是0.45359237公斤，一英寸是0.0254米。
 * @author QIA
 * @create 2024-11-28-21:41
 */
public class Main01 {
    public static void main(String[] args) {

        //保留n位小数(#.0000四位)
        DecimalFormat d = new DecimalFormat("#.0000");
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入体重（磅）：");
        double b = sc.nextDouble();
        System.out.print("请输入身高（英寸）：");
        double y = sc.nextDouble();

        double t = b*0.45359;
        double m = y*0.0254;
        double BIM = t/(m*m);

        System.out.println("用户的BIM值为："+d.format(BIM));

    }
}
