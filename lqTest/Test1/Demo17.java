package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 单词分析
 *
 * @author QIA
 * @create 2023-03-16-20:10
 */
public class Demo17 {
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
            if(arr[i] >= max) {
                max = arr[i];
                ch = (char)(i + 'a');
            }
        }
        System.out.println(ch);
        System.out.println(max);
    }
}
