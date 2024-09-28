package Competition.LuoGu.chuanzhibei;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2022-11-19-15:54
 */
public class Text02 {
    public static int main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextInt();
        int count = 0;
        int[] max = new int[4];

        if (num <= 60) {
            count = 0;
        } else {
            if (num <= 1440) {
                if (num / 60 >= 10) {
                    max[0] = (int) (num / 600);
                    max[1] = (int) (num / 60 % 10);
                    max[2] = (int) (num % 60 / 10);
                    max[3] = (int) (num % 600);
                } else {
                    max[0] = 0;
                    max[1] = (int) (num / 60);
                    max[2] = (int) (num % 60 / 10);
                    max[3] = (int) (num % 600);
                }
            } else {

            }
        }
        System.out.println(count);
//
//        private static void moiv(int[] max){
//            //判断从0到当前时间的等差数列
//            for (int i = 0; i < max[0]; i++) {
//                for (int j = 0; j < max[1]; j++) {
//                    for (int k = 0; k < max[2]; k++) {
//                        for (int l = 0; l < max[3]; l++) {
//                            if(l-k == k-j && k-j == j-i){
//                                count++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        return count;
    }
}
