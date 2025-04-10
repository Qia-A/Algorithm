package LanQianBei16th.LqTest.Demo05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2143 最少刷题数
 * @author QIA
 * @create 2025-03-24-18:43
 */
public class Main50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arrend = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            arrend[i] = arr[i];
        }
        sc.close();

        // 排序
        Arrays.sort(arr);
        int mid = arr[N/2];

        // 计算小于或大于中值的元素个数
        int less = 0, more = 0;
        for (int i = 0; i < N; i++) {
            if (arrend[i] < mid){
                less++;
            }else if(arrend[i] > mid){
                more++;
            }
        }

        // 进行判断并输出
        // 当小于的人数大于大于人数时，小于的人数刷到等于中值即可；
        // 当小于的人数小于大于的人数时，小于的人数可以刷到中值+1。
        for (int i = 0; i < N; i++){
            if (arrend[i] > mid){
                System.out.print("0 ");
            }else if (arrend[i] == mid && less >= more){
                System.out.print("0 ");
            }else if (arrend[i] == mid && less < more){
                System.out.print("1 ");
            }else if (arrend[i] < mid && less > more){
                System.out.print(mid-arrend[i] + " ");
            }else if (arrend[i]< mid && less <= more){
                System.out.print(mid-arrend[i]+1+" ");
            }
        }
    }
}
