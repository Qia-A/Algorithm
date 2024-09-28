package Competition.lanqiao.lqTest.Test1;

/**
 * @author QIA
 * @create 2023-03-17-9:29
 */
public class Demo18 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 10; i <= 2020; i++) {
            int num = i;
            while(num > 0) {
                if(num % 10 == 2){
                    count++;
                }
                num /= 10;
            }
        }
        System.out.println(count);
    }
}
