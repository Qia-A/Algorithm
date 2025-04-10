package LanQianBei16th.LqTest.Demo07;

/**
 * @author QIA
 * @create 2025-04-08-22:10
 */
public class Main68 {
    public static void main(String[] args) {
        // 二进制的每位数之和等于四进制的每位数之和，1-2024
        int cut = 0;
        for (int i = 1; i <= 2024; i++) {
            if (two(i) == four(i)) cut++;
        }
        System.out.println(cut);
    }

    private static int two(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 2;
            n /= 2;
        }
        return sum;
    }

    private static int four(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 4;
            n /= 4;
        }
        return sum;
    }
}
