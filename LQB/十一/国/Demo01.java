package Competition.lanqiao.LQB.十一.国;

/**
 * 国赛  试题a 美丽的2
 * 题目：小蓝特别喜欢 2，今年是公元 2020 年，他特别高兴他很好奇，
 * 在公元 1 年到公元 2020 年 (包含) 中，有多少个年份的数位中包含数字 2?
 * @author QIA
 * @create 2023-03-13-14:40
 */
public class Demo01 {
    public static void main(String[] args) {
        // 定义临时变量
        int n = 0, count = 0, num = 0;
        // 遍历所有年份
        for (int i = 1; i <= 2020; i++) {
            count = i;
            while (count != 0){
                // 遍历每一位
                num = count % 10;
                count /= 10;
                // 判断是否为2
                if (num == 2) {
                    n++;
                    break;
                }
            }
        }
        System.out.println(n);
    }

    /**
     * 第二种方法，分割字符串
     */
    public static void number(){
        int count = 0;
        for (int i = 1; i <= 2020; i++) {
            // 分割字符串
            String s = i + "";
            // 遍历每个字符串
            for (int j = 0; j < s.length(); j++) {
                // 判断是否为2
                if (s.charAt(j) == '2'){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
