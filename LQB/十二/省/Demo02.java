package Competition.lanqiao.LQB.十二.省;

/**
 *  十二届 省赛 Java C组 试题D: 相乘
 *  题目：小蓝发现，他将1至1000000007之间的不同的数与2021相乘后再求除以1000000007的余数，会得到不同的数。
 *  小蓝想知道，能不能在1至1000000007之间找到一个数，与 2021相乘后再除以1000000007后的余数为999999999。
 *  如果存在，请在答案中提交这个数;
 *  如果不存在，请在答案中提交0。
 *  运行限制：
 *      最大运行时间：1s
 *      最大运行内存：128M
 * @author QIA
 * @create 2023-03-03-0:05
 */
public class Demo02 {
    public static void main(String[] args) {
        long num = 0;
        for (long i = 1; i <= 1000000007; i++) {
            if (i * 2021 % 1000000007 == 999999999) {
                num = i;
                System.out.println(num);
                return;
            }
        }
    }
}