package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 模拟  回文日期
 * 题目描述：2020 年春节期间，有一个特殊的日期起了大家的注意: 2020 年2月2日。因为如果将这个日期按“yyyymmdd”的格式写成一个8 位数是20200202，恰好是一个回文数。我们称这样的日期是回文日期。
 *    有人表示20200202 是“千年一遇”的特殊日子。对此小明很不认同，因为不到2年之后就是下一个回文日期: 20211202 即2021 年 12 月2 日
 *    也有人表示20200202 并不仅仅是一个回文日期，还是一个ABABBABA型的回文日期。对此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA型的回文日期: 21211212 即2121 年 12月12 日。算不上“千年一遇”，顶多算“年两遇”。
 *    给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个ABABBABA型的回文日期各是哪一天
 * 输入描述：输入包含一个八位整数 N，表示日期
 *    对于所有评测用例，10000101 < N< 89991231，保证 N 是一个合法日期的8位数表示
 * 输出描述：输出两行，每行 1 个八位数。第一行表示下一个回文日期；
 *    第二行表示下一个ABABBABA型的回文日期
 * 输入输出样例
 *    示例   输入：20200202   输出：20211202  /n  21211212
 * 运行限制：
 *    最大运行时间：1s
 *    最大运行内存：256M
 * @author QIA
 * @create 2023-03-09-1:10
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        // 用于判断第一个回文是否已经输出
        // 因为在第一个回文和第一个ABAB之间可能还存在若干个回文，这些回文我们不输出
        int key = 0;

        // 因为不知道下一个回文日期，所以定义一个死循环，遇到回文日期再break
        while (true) {
            while (true) {
                // 日期自加
                date = AddDate(date);

                // 输出下一个回文
                if (isHuiWen(date)) {
                    if (key == 0) {
                        System.out.println(date);
                        key++;
                        break;
                    } else {
                        break;
                    }
                }
            }

            if (isABAB(date)) {
                System.out.println(date);
                break;
            }
        }
    }

    // 判断回文
    public static boolean isHuiWen(String date) {
        // 回文日期，就是日期反转后，与原来的日期相等
        return date.equals(new StringBuffer(date).reverse().toString());
    }

    // 判断ABAB -- 在回文日期的基础上判断，节约时间
    public static boolean isABAB(String date) {
        // 转换成字符数组
        char[] c = date.toCharArray();
        // ABAB型，第一个字符和第三个字符相等，第二个字符与第四个字符也相等
        if(c[0] == c[2] && c[1] == c[3]) {
            return true;
        }
        return false;
    }

    // 日期自加
    public static String AddDate(String date) {
        // 转换成整型
        int d = Integer.parseInt(date);
        // 分离年月日
        int year = d / 10000;int month = d% 10000 / 100; int day = d % 100;

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 判断平年闰年
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            arr[1] = 29; // 闰年二月有29天
        } else {
            arr[1] = 28; // 平年二月有28天
        }

        day++;
        if (day > arr[month - 1]) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
        return year*10000+month*100+day + "";
    }
}
