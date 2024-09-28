package Competition.lanqiao.lqTest.Test2;

/**
 * @author QIA
 * @create 2023-03-24-11:12
 */
public class Demo18 {
    //判断输入的数是否含2
    static boolean check(int a) {
        while (a > 0) {
            if (a % 10 == 2)
                return true;
            a /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;
        for (int i = 1900; i <= 9999; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {//闰年
                day[1] = 29;
            } else {
                day[1] = 28;
            }
//            if(check(i)) //如果在这里判断，每一年只会判断一次，少判断了，要把年月日合起来，有了就算
//                ans++;
            for (int month = 1; month <= 12; month++) {
//                if(check(month))
//                    ans++;
                for (int d = 1; d <= day[month - 1]; d++) {
                    if (check(d) || check(i) || check(month))
                        ans++;
                }
            }
        }
        System.out.println(ans);
    }
}