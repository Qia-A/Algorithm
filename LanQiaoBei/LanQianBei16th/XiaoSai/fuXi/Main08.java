package LanQianBei16th.XiaoSai.fuXi;

import java.util.Scanner;

/**
 * 找出最小元素的下标
 * @author QIA
 * @create 2024-11-30-15:15
 */
public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        System.out.println("最小元素的下标为："+indexOfSmall(array));
    }
    
     public static int indexOfSmall(double[] array) {
        int count=0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] < array[count]){
                 count = i;
             }
         }
        return count;
     }
}
