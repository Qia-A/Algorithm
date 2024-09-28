package Competition.LuoGu.chuanzhibei;

import java.util.Scanner;

/**
 *传智杯 #3 运气
 *      哈兰·斯威提是YYH Land远近闻名的注铅骰子爱好者。有一天他碰到了这么一个问题：
 * 你有一枚6个面的骰子，分别写了1,2,3,4,5,6每一面朝上的概率是均等的。
 * 现在哈兰想知道，如果他投掷n次，并且将结果按顺序写在纸上成为一个数。
 * （比如说如果哈兰扔了3次,分别是3,2,5,那么他最后得到的数就是325)
 * 他现在想知道这个数是k的倍数的可能情况有多少种，其中k是一个特定的数。
 * 由于这个方案数可能会很大，所以请你输出结果对10^9+7取模的结果。
 *
 * @author QIA
 * @create 2022-11-19-12:56
 */
public class Demo05 {
    public static void main(String[] args) {
        //定义nk num得到的数，count符合条件的数的数量
        //判断6^n中为k的倍数的有多少种可能
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        long num = 0;
        int count=0;

        int i = 0;

            if (num % k == 0){
                count++;
            }
    }
}
