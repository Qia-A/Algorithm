package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-26-21:48
 */
public class Demo20 {
    public static void main(String[] args) {

        // 暴力枚举
        Scanner rd = new Scanner(System.in);
        double a = rd.nextDouble();
        double b = rd.nextDouble();
        double c = rd.nextDouble();
        double d = rd.nextDouble();
        for (double i = -100; i <= 100; i += 0.01)
            if (Math.abs(a * i * i * i + b * i * i + c * i + d) < 0.000001)
                System.out.printf("%.2f ", i);
    }
}