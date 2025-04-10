package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 742 合唱队形
 * @author QIA
 * @create 2025-03-19-12:31
 */
public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] zx = new int[N]; // 每一个为中心的个数
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 用来存储左右符合条件的个数
        int[] left = new int[N];
        int[] right = new int[N];

        // 遍历整个数组，计算以每个人为中心的左边有几个符合条件
        for (int i = 0; i < N; i++) {
            left[i] = 0; // 初始设为0
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {//如果目前的数比初始的数要小
                    left[i]=Math.max(left[i], left[j]+1);
                }
            }
        }
        //遍历整个数组,算出以每个人为中心的右边有几个符合条件
        for(int i=N-1;i>=0;i--) {
            right[i]=0;//初始设为0
            for(int j=N-1;j>=i;j--) {
                if(arr[j] < arr[i]) {//如果目前的数比初始的数要小
                    right[i]=Math.max(right[i], right[j]+1);
                }
            }
        }

        for(int i=0;i<N;i++) {
            //每一个数为中心的符合条件的个数
            zx[i]=left[i]+right[i]+1;
        }
        int max=0;
        //取出其中的最大值,也就是需要最少同学出列的数
        for(int i=0;i<N;i++) {
            if(max<zx[i]) {
                max=zx[i];
            }
        }
        System.out.println(N-max);
    }
}
