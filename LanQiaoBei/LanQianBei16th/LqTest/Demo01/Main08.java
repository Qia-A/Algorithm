package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;

/**
 * 1.字符串分割成单个字符
 * 2.判断字符串内有相同的并计算个数
 * 3.将计算出的个数最大的减去最小的
 * @author QIA
 * @create 2025-03-04-21:54
 */
public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0,j=97; i < 26 ; i++,j++) {
            arr[i] = j;
        }
        // 1、读取每个字符出现次数,a=97，z=122
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            arr[(int)s-97]++;
        }
        //2、判断出最大的减去最小的
        int max = 0,min = 1000;
        for (int i = 0,j = 97; i < arr.length; i++,j++) {
            arr[i]-=j;
            if (arr[i] != 0){
                if (arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println(max-min);
    }
}
