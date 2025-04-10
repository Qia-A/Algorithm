package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 分解质因数
 * @author QIA
 * @create 2025-04-09-22:41
 */
public class Main73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            number(i);
        }
    }

    public static void number(int k){
        if (check(k)) {
            System.out.println(k+"="+k);
        }else {
            int count=k;
            String l=count+"=";
            for (int i = 2; i < k; i++) {
                while (count % i==0) {
                    l += +i+"*";
                    count /= i;
                }
            }  // substring()java的字符串返回值方法
            System.out.println(l.substring(0,l.length()-1));
        }
    }

    // 确认该数是否除自身外没有其他因数
    public static boolean check(int c) {
        for (int i = 2; i < c; i++) {
            if (c % i==0){
                return false;
            }
        }
        return true;
    }
}
