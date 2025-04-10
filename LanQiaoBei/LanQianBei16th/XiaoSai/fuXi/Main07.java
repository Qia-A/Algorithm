package LanQianBei16th.XiaoSai.fuXi;

/**
 * @author QIA
 * @create 2024-11-30-14:21
 */
public class Main07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {

            // 前一半
            for (int j = 8-i; j >0 ; j--) {
                System.out.print(" "+"\t");
            }
            System.out.print(1+"\t");
            for (int j = 1; j < i ; j++) {
                System.out.print((int)(Math.pow(2,j))+"\t");
            }

            // 后一半
            for (int j = i-2; j > 0; j--) {
                System.out.print((int)(Math.pow(2,j))+"\t");
            }
            if(i != 1) System.out.print(1+"\t");
            for (int j = 7-i; j > 0 ; j--) {
                System.out.print(" "+"\t");
            }
            System.out.println();
        }
    }
}
