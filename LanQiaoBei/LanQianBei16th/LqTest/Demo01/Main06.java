package LanQianBei16th.LqTest.Demo01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 19730 神奇闹钟
 * @author QIA
 * @create 2025-03-01-15:36
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 定义自定义格式
        LocalDateTime startTime = LocalDateTime.of(1970,1,1,0,0,0);
        // LocalDateTime.of()用于创建一个指定年月日时分秒的LocaldateTime对象

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine(); // 读取输入
            String[] parts = input.split(" "); // 将输入的字符串分为三部分
            String dateTimeStr = parts[0]+" "+parts[1]; // 1，2部分为时间
            int x = Integer.parseInt(parts[2]);//3部分为闹铃时间间隔

            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, ft); // format将字符串转为时间
            // LocalDateTime.parse()将字符串解析为LocalDateTime对象，需要指定格式
            long delteMin = java.time.Duration.between(startTime, dateTime).toMinutes();//获取总的时间间隔
            // Duration.between 用于计算时间间隔，toMinutes()转换为分钟数
            long n = delteMin / x; // 求有多少个闹铃间隔时间x
            LocalDateTime result = startTime.plusMinutes(n*x); // 结果为起始时间加上n个闹铃时间按间隔
            // LocalDateTime.plusMinutes()加上指定分钟数，LocalDateTime.minusMinutes()减

            System.out.println(result.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        }
    }
}
