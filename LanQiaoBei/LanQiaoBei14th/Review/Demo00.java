package Contest_23.LanQiaoBei14th.Review;

import org.junit.Test;

/**
 * 链接：http://t.csdn.cn/Yc6ay
 * @author QIA
 * @create 2023-03-07-16:53
 */
public class Demo00 {

    @Test
    public void Test1() {
        // 交换两数
        /** 解释：
         * 两个相同的数异或之后结果会等于0，即 n ^ n = 0。并且任何数与 0 异或等于它本身，即 n ^ 0 = n。
         * 所以，把（1）中的 x 带入 （2）中的 x，有：
         * y = x^y = (xy)y = x(yy) = x^0 = x。 x 的值成功赋给了 y。
         * 对于（3）,同理推导如下：
         * x = x^y = (xy)x = (xx)y = 0^y = y。
         * 异或运算支持运算的交换律和结合律哦。
         */
        int a = 23, b = 7;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + "\t" + b);
    }

    @Test
    public void Test2() {
        int[] arr = {1,8,5,2,2,9,6,9,6,1,5};
        //找出没有重复的数（落单的数）,这组数据种有一个数只出现了一次
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = tmp ^ arr[i];
        }
        System.out.println(tmp);
    }

    @Test
    public void Test3() {
        int n = 19;
        // 找出不大于 N 的最大的2的幂指数
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8; //整形一般是 32 位，这里是假设 8 位
        System.out.println((n + 1) >> 1);
    }

}
