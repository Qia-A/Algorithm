package LanQianBei16th.XiaoSai.fuXi;

/**
 * 编写一个程序，使用 Math.random()方法显示一个随机的大写字母。
 * @author QIA
 * @create 2024-11-30-13:00
 */
public class Main05 {
    public static void main(String[] args) {
        // 26个字符，随机数的范围就是0-26
        System.out.println("随机生成的字母为："+(char)((Math.random()*26) + 65));
    }
}
