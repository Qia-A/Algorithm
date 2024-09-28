package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 饮料换购
 * @author QIA
 * @create 2023-03-19-16:54
 */
public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        while(n >= 3) {
            count += n / 3;
            n = n%3 + n/3;
        }
        System.out.println(count);
    }
}
