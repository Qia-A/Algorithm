package Competition.lanqiao.lqTest.Test3;

/**
 * 填空题  2021  模拟赛
 * 倍数
 * @author QIA
 * @create 2023-03-31-0:03
 */
public class Demo05 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 6; i <= 2020; i++) {
            if (i % 4 == 0 && i % 6 == 0){
                count++;
            }
        }
        System.out.println(count );
    }
}
