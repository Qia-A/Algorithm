package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 字符串 暴力  2020  省赛
 * 单词分析
 * @author QIA
 * @create 2023-03-26-18:18
 */
public class Demo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        int max = 0;
        char ch = 'a';
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ch = (char)(i + 'a');
            }
        }
        System.out.println(ch);
        System.out.println(max);
    }
}
