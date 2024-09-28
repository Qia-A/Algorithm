package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 刷题集训A
 * 成绩分析
 * @author QIA
 * @create 2023-03-22-9:37
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int max = score[0];
        int min = score[0];
        double avg = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            avg += score[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(String.format("%.2f",avg/n));
    }
}
