package LanQianBei16th.LqTest.Demo03;

import java.util.Scanner;
/**
 * 323 用杂志拼接信件
 * @author QIA
 * @create 2025-03-11-23:41
 */

public class Main26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean flag = true;
        for (int i = 0,j=0; i < str1.length()&&j < str2.length(); i++,j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");

//        int n = str2.length()-1;
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) == str2.charAt(n)){
//                n--;
//                while (str2.charAt(n) == str2.charAt(n+1)){
//                    n--;
//                }
//                i = 0;
//            }else if (i == str1.length()-1){
//                System.out.println("NO");
//            }
//        }
//        System.out.println("YES");
    }
}
