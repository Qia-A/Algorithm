package Competition.LuoGu.chuanzhibei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1024发橙子
 * @author QIA
 * @create 2022-11-16-17:07
 */
public class Demo02 {
    //相邻的同学的橙子必须更多，若两个同学的成绩一样，则它们分到的数量必须平等。
    public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            int n = S.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = S.nextInt();
            }
            int[] arrs = new int[Math.toIntExact(n)];
            Arrays.fill(arrs,1);
            long num = 0;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] > arr[i-1]){
                    arrs[i] = Math.max(arrs[i],arrs[i-1]+1);
                }
                if (arr[i] == arr[i-1]){
                    arrs[i] = arrs[i-1];
                }
            }
            for (int i = arr.length-2; i >= 0; i--){
                if (arr[i] > arr[i+1]){
                    arrs[i] = Math.max(arrs[i],arrs[i+1]+1);
                }
                if (arr[i] == arr[i+1]){
                    arrs[i] = arrs[i+1];
                }
            }
            for (int i = 0; i < arrs.length; i++){
                num += arrs[i];
            }
            System.out.println(num);
    }
}
