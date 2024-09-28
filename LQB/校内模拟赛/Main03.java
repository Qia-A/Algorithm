package Competition.lanqiao.LQB.校内模拟赛;

/**
 * @author QIA
 * @create 2023-03-11-15:28
 */
public class Main03 {
    public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        int count = 0;// 计数
        for (int i = 1900; i <= 9999; i++) {
            // 年份各位数之和
            int x = i;
            int sum = 0;
            while(x > 0) {
                sum += x % 10;
                x /= 10;
            }
            for (int j = 1; j <= 12; j++) {
                // 月份各位数之和
                int t1 = j;
                if (t1 >= 10) t1 -= 9;
                for (int k = 1; k <= 31; k++) {
                    //天数各位数之和 31天
                    int y = k;
                    int t2 = 0;
                    while (y > 0) {
                        t2 += y % 10;
                        y /= 10;
                    }
                    if (t1 + t2 == sum && isDate(i,j,k)) count++;
                }
            }
        }
        System.out.println(count);
    }

    // 判断是不是瑞年的
    private static boolean isDate(int y, int m, int d) {
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
            if(m == 2){
                if(d > 29) return false;
                else return true;
            }else{
                if(d > days[m]) return false;
                else return true;
            }
        }
        if(d > days[m]) return false;
        return true;
    }
}
