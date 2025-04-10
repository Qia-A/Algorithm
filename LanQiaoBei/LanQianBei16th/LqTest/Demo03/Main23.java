package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;

/**
 * 3.7最大化股票交易的利润
 * @author QIA
 * @create 2025-03-10-22:37
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = -888;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int count = arr[j] - arr[i];
                if (count > max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
