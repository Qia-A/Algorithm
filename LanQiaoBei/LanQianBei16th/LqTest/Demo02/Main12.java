package LanQianBei16th.LqTest.Demo02;

/**
 * 38红包【算法赛】
 * @author QIA
 * @create 2025-03-08-19:12
 */
public class Main12 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2025; i++) {
            if (i % 3 ==0 || i % 8==0 || i % 38 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
