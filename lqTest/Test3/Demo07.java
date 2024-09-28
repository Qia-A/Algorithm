package Competition.lanqiao.lqTest.Test3;

import java.util.Scanner;

/**
 * 纸张大小
 * @author QIA
 * @create 2023-04-03-19:46
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chang = 1189;
        int kuan = 841;
        String str = sc.nextLine();
        String[] ch = str.split("");
        int n = Integer.parseInt(ch[1]);
        for (int i = 0; i < n; i++) {
            int temp = kuan;
            kuan = chang / 2;
            chang = temp;
        }
        System.out.println(chang);
        System.out.println(kuan);
    }
}
