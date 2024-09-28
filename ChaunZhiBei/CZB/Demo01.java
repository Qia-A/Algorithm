package Competition.LuoGu.CZB;

import java.util.Scanner;


/**
 * @author QIA
 * @create 2022-11-26-12:42
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nextLine = s.nextLine();
        String[] split = nextLine.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (b > 0){
            System.out.println((int) Math.abs(a));
        }
        if (b < 0){
            System.out.println(-(int) Math.abs(a));
        }
    }
}
