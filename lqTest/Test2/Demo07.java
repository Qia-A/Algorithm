package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 天干地支
 * @author QIA
 * @create 2023-03-22-10:47
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String[] str1 = new String[]{"geng","xin","ren","gui","jia","yi","bing","ding","wu","ji"};
        String[] str2 = new String[]{"zi","chou","yin","mao","chen","si","wu","wei","shen","you","xu","hai"};

        int tg = 0;
        int dz = 0;
        if(year == 1900 || year == 1960 || year == 2020) {
        }else if (year > 1960) {
            for (int i = 1960; i < year; i++) {
                if (tg == 9) tg=0;
                else tg++;
                if (dz == 11) dz=0;
                else dz++;
            }
        } else {
            for (int i = year; i < 1960; i++) {
                if (tg == 0) tg = 9;
                else tg--;
                if(dz == 0) dz = 11;
                else dz--;
            }
        }
        System.out.println(str1[tg] + str2[dz]);
    }
}
