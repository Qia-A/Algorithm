package LanQianBei16th.LqTest.Demo06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

/**
 * 19702 数字串个数
 * @author QIA
 * @create 2025-03-25-20:45
 */
public class Main54 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        BigInteger mod = new BigInteger("1000000007");

        // 容斥原理：先统计出来总共的10000^9，减去不带3的8^10000和不带7的8^10000。
        // 不带3和7的总共有10000^7。不带3和7的已经包含在不带3和不带7里面了。
        BigInteger a = new BigInteger("9");
        a = a.pow(10000);
        BigInteger b = new BigInteger("8");
        b = b.pow(10000);
        BigInteger c = new BigInteger("7");
        c = c.pow(10000);

        b=b.multiply(BigInteger.valueOf(2));
        a=a.subtract(b);
        a=a.add(c);
        a=a.mod(mod);
        System.out.println(a);
    }
}
