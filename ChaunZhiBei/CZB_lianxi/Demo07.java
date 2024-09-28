package Competition.LuoGu.chuanzhibei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1024分橙子
 *
 * @author QIA
 * @create 2022-11-25-18:31
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //分数
        int[] score = new int[n];
        //每个人对应的橙子
        int[] record = new int[n];
        Arrays.fill(record, 1);
        for (int i = 0; i < score.length; i++) {
            score[i] = s.nextInt();
        }
        //从前往后
        for (int i = 1; i < score.length; i++) {
            if(score[i] > score[i-1]) {
                record[i] = Math.max(record[i-1] + 1,record[i]);
            }
            if(score[i] == score[i-1]){
                record[i] = record[i-1];
            }
        }
        //从后往前
        for (int i = score.length - 2; i >= 0; i--) {
            if (score[i] > score[i+1]){
                record[i] = Math.max(record[i+1] + 1,record[i]);
            }
            if(score[i] == score[i+1]){
                record[i] = record[i+1];
            }
        }

        long sum = 0;
        for (int i = 0; i < record.length; i++) {
            sum += record[i];
        }
        System.out.println(sum);
    }
}
