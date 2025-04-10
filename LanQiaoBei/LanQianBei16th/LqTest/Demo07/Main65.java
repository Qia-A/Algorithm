package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-04-07-16:18
 */
public class Main65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //在此输入您的代码...
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i< m;i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 100000;
        int max = -1;
        while(left <= right){
            int mid = (left+right)/2;
            int cut = 0; // 用于记录当前区域可容纳牛数量
            for(int i = 0;i < m;i++){
                cut += arr[i]/mid;
            }
            if(n > cut){  // 当牛的数量大于可容纳数量时，则右边界缩减
                right = mid-1;
            }else{ // 否则，即左边界增大，同时为当前最大区域。
                left = mid+1;
                max = mid;
            }
        }
        System.out.println(max);
    }
}
