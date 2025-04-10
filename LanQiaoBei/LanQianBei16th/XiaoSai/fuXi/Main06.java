package LanQianBei16th.XiaoSai.fuXi;

/**
 *
 * @author QIA
 * @create 2024-11-30-13:08
 */
public class Main06 {
    public static void main(String[] args) {
        // 图案1
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // 图案2
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // 图案3
        for (int i = 1,j = 5; i <= 6 ; i++,j--) {
            for (int k = j; k > 0; k--) {
                System.out.print(" "+" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        // 图案4
        for (int i = 1,j = 0; i <= 6 ; i++,j++) {
            for (int k = j; k > 0; k--) {
                System.out.print(" "+" ");
            }
            for (int k = 1; k <= 7-i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
