package Competition.lanqiao.lqTest.Test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author QIA
 * @create 2023-04-06-16:48
 */
public class Demo09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance(); // 使用默认时区和语言环境获得一个日历。
        Calendar cal_1 = Calendar.getInstance();  // 使用默认时区和语言环境获得一个日历。
        Calendar cal_2 = Calendar.getInstance();  // 使用默认时区和语言环境获得一个日历。

        System.out.println("今天：" + format.format(cal.getTime()) + ",这是这个月的第多少天：" + cal.get(Calendar.DAY_OF_MONTH));

        // 取当前日期的前一天
        cal_1.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println("昨天：" + format.format(cal_1.getTime()));

        // 取当前日期的后一天
        cal_2.add(Calendar.DAY_OF_MONTH, +1);
        System.out.println("今天：" + format.format(cal_2.getTime()));


        // 取两个日期间相隔的天数：
        Date beginDate = format.parse("1900-01-01");
        Date endDate = format.parse("2023-04-06");

        long Day = ((endDate.getTime() - beginDate.getTime())/24*60*60*1000);
        System.out.println("相隔的天数=" + Day);
        System.out.println("假设1900年1月1日为周1，则2023年4月6日为周" + Day % 7);
    }
}
