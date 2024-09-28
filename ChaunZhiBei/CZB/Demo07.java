package Competition.LuoGu.CZB;

import java.util.Scanner;

public class Demo07 {
    public static int fun(int a, int b){
        int num = 0;
        num = sgn(b) * Math.abs(a);
        return num;
    }
    public static int sgn(int b){
        int num = 0;
        if (b > 0){
            num = 1;
        }
        if(b < 0){
            num = -1;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String nextLine = c.nextLine();
        String[] str = nextLine.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(fun(a,b));
    }
}
