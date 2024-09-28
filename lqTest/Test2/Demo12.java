package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2021 国赛 二分
 * 123
 * @author QIA
 * @create 2023-03-23-10:50
 */
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[][] T = new long[t][2];
        for (int i = 0; i < t; i++) {
            T[i][0] = sc.nextLong();
            T[i][1] = sc.nextLong();
        }

        for (int i = 0; i < T.length; i++) {
            System.out.println(sum(T[i][0],T[i][1]));
        }
    }


    private static long sum(long a, long b){
        // 求求和
        long sum = 0;
        long count = 1;
        for (int j = 1; count <= b; j++) {
            for (int i = 1; i <= j; i++) {
                if(count >= a) {
                    sum += i;
                }
                count++;
                if (count > b) break;
            }
        }
        return sum;
    }
}
