package LanQianBei16th.LqTest.ALGO;

import java.util.Scanner;

/**
 * 杨辉三角
 * 如果我们按从上到下、从左到右的顺序把所有数排成一列，
 * 可以得到如下数列:1,1,1,1,2,1,1,3,3,1,1,4,6,4,1,..
 * 给定一个正整数 N，请你输出数列中第一次出现 N 是在第几个数?
 *
 * @author QIA
 * @create 2024-11-30-15:40
 */
public class Main01 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        boolean isflag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
                count += 1;
                if (arr[i][j] == num) {
                    isflag = true;
                    break;
                }
            }
            System.out.println();
            if (isflag) break;
        }
        System.out.println(count);
    }
}
