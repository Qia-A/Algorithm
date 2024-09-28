package Competition.lanqiao.LQB.校内模拟赛;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-11-16:34
 */
public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if ((str.charAt(0) == 'l' || str.charAt(0) == 'L')
            && (str.charAt(1) == 'a' || str.charAt(0) == 'A')
            && (str.charAt(2) == 'n' || str.charAt(0) == 'N')
            && (str.charAt(3) == 'q' || str.charAt(3) == 'Q')
            && (str.charAt(4) == 'i' || str.charAt(4) == 'I')
            && (str.charAt(5) == 'a' || str.charAt(5) == 'A')
            && (str.charAt(6) == 'o' || str.charAt(6) == 'O')
        ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
