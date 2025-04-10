package Contest_23.LanQiaoBei14th.Review;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *  蓝桥杯Java-大数（整数、小数）处理
 *  https://blog.csdn.net/qq_63593632/article/details/121850496
 * @author QIA
 * @create 2023-03-14-14:20
 */
public class Demo02 {

    // 两数相减
    @Test
    public void test1(){
        String s = "-23423432";
        String ss = "23423433";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger sad = bs.add(bss);
        System.out.println(sad);
    }

    // 两数相乘
    @Test
    public void test2(){
        String s = "2";
        String ss = "3";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger sad = bss.multiply(bs);
        System.out.println(sad);
    }

    // 两数相除
    @Test
    public void test3(){
        String s = "3";
        String ss = "7";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger sad = bss.divide(bs); // bss/bs
        System.out.println(sad); //2
    }

    // 求相反数negate()的使用
    @Test
    public void test4(){
        String s = "-3";
        String ss = "7";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger nebs = bs.negate();
        BigInteger nebss = bss.negate();
        System.out.println(nebs); // 3
        System.out.println(nebss); // -7
    }

    // 求余树remainder()的使用
    @Test
    public void test5(){
        String s = "3";
        String ss = "7";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger nebs = bss.remainder(bs); // bss%bs
        System.out.println(nebs); // 1
    }

    // 求模mod()的使用
    @Test
    public void test6(){
        String s = "3";
        String ss = "7";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger nebs = bss.mod(bs); // bss%bs
        System.out.println(nebs); // 1
    }

    @Test
    public void test7(){
        String s = "2";
        int p = 4;
        BigInteger bs = new BigInteger(s);
        BigInteger nebs = bs.pow(p);
        System.out.println(nebs); // 16
    }

    @Test
    public void test8(){
        String s = "2234231";
        BigInteger bs = new BigInteger(s);
        double ne = bs.doubleValue();
        System.out.println(ne); // 2234231.0
    }

    // 求两数的最大公约数gcd()的使用
    @Test
    public void test9(){
        String s = "2234232";
        String ss = "2342342343";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger ne = bss.gcd(bs);
        System.out.println(ne); // 33
    }

    // 求两数的按位与and()的使用
    @Test
    public void test10(){
        String s = "23";
        String ss = "7";
        BigInteger bs = new BigInteger(s);
        BigInteger bss = new BigInteger(ss);
        BigInteger ne = bss.and(bs);
        System.out.println(ne); // 7
    }

    /**
     * BigInteger进制转换
     */
    // 十进制转其他进制
    @Test
    public void test11(){
        String string1 = new BigInteger("20", 10).toString(2);
        System.out.println("十进制的20转换成二进制是：" + string1); // 10100

        String string2 = new BigInteger("20", 10).toString(8);
        System.out.println("十进制的20转换为八进制是" + string2); // 24

        String string3 = new BigInteger("20", 10).toString(16);
        System.out.println("十进制的20转换为八进制是" + string3); // 14
    }

    // 其他进制转十进制
    @Test
    public void test12(){
        String string4 = new BigInteger("110", 2).toString(10);
        System.out.println("二进制的110转换成十进制是："+string4); // 6

        String string5 = new BigInteger("110", 8).toString(10);
        System.out.println("八进制的110转换成十进制是："+string5); // 72

        String string6 = new BigInteger("110", 16).toString(10);
        System.out.println("十六进制的110转换成十进制是："+string6); // 272
    }

    // 小数（BigDecimal类）
    @Test
    public void test13(){
        Scanner cin = new Scanner(System.in);
        BigDecimal a,b;
        a = cin.nextBigDecimal();
        b = cin.nextBigDecimal();
        System.out.println(a.add(b)); // 加
        System.out.println(a.subtract(b)); // 减
        System.out.println(a.multiply(b)); // 乘
        System.out.println(a.divide(b)); // 除
        System.out.println(a.remainder(b)); // 求余
    }

    // 小数位数
    @Test
    public void test14(){
        Scanner sc = new Scanner(System.in);
        BigDecimal big;
        big = sc.nextBigDecimal();
        System.out.println(big.scale());  // scale() 获取小数位数；若是整数则为负数，表示的末尾的0个数
        System.out.println(big);
        big = big.stripTrailingZeros(); // 去掉小数末尾的无用0
        System.out.println(big.scale());
        System.out.println(big);
    }
}
