package Contest_23.LanQiaoBei14th.Review;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-14-15:48
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal big;
        big = sc.nextBigDecimal();   // 123.4500000
        System.out.println(big.scale());/* 7 */  // scale() 获取小数位数；若是整数则为负数，表示的末尾的0个数
        System.out.println(big);  /* 123.4500000 */
        big = big.stripTrailingZeros(); // 去掉小数末尾的无用0
        System.out.println(big.scale()); /* 2 */
        System.out.println(big); /* 123.45 */
    }
}
