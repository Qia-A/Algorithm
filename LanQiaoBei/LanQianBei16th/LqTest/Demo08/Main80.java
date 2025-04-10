package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 整数查找
 * @author QIA
 * @create 2025-04-10-16:53
 */
public class Main80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index;
        while (q-- > 0) {
            int k = sc.nextInt();
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int x = sc.nextInt();

            if (k==1){
                index = -1;
                // 输出l-r数组中等于x最左边的数的下标
                for (int i = l; i <= r; i++) {
                    if (arr[i] == x) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) index++;
                System.out.println(index);
            }else if(k==2){
                index = -1;
                // 输出l-r数组中等于x最右边的数的下标
                for (int i = r; i >= l; i--) {
                    if (arr[i] == x) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) index++;
                System.out.println(index);
            }else if(k==3){
                index = -1;
                // 输出l-r数组中大于等于x的第一个数的下标
                for (int i = l; i <= r; i++) {
                    if (arr[i] >= x) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) index++;
                System.out.println(index);
            } else if(k==4) {
                index = -1;
                // 输出l-r数组中大于x的第一个数的下标
                for (int i = l; i <= r; i++) {
                    if (arr[i] > x) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) index++;
                System.out.println(index);
            }
        }
    }
}
