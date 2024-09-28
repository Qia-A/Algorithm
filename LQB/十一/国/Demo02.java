package Competition.lanqiao.LQB.十一.国;

/**
 * 国赛   试题B：合数个数
 * 题目：一个数如果除了 1 和自己还有其他约数，则称为一个合数。
 * 例如: 1,2.3不是合数，4.6 是合数。
 * 请问从 1 到 2020 一共有多少个合数。
 *
 * @author QIA
 * @create 2023-03-13-15:07
 */
public class Demo02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 4; i <= 2020; i++) {
            int num = 2;
            while (num < i) {
                if (i % num == 0) {
                    count++;
                    break;
                }
                num++;
            }
        }
        System.out.println(count);
    }
}
