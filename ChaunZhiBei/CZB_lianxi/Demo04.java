package Competition.LuoGu.chuanzhibei;

import java.util.Scanner;

/**
 * 传智杯
 *  期末考试成绩：
     * 首先，所有学生会有一个卷面得分，这个得分一定是一个[0,100]之间的整数。
     * 如果卷面得分在90分以上，那么他的GPA（加权平均成绩）就是满分4.0。
     * 如果卷面得分在60∼89之间，那么他每比90分少1分，那么他的分数就会在4.0的基础上减少0.1。
     * 如果卷面得分不到60分，那么善良的老师会给他照顾。具体来说，如果他的分数为x，
     * 那么老师会把他的分数调整为【根号下x】×10（向下取整），再计算他的GPA。
     * 如果经过调整该学生的得分依旧没满60，那么他就挂科了，GPA就是0分。
     * 现在给你一个人的期末卷面得分，请你输出他的最终GPA
 *
 * @author QIA
 * @create 2022-11-18-23:45
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        double GPA = 0.0;
        if (score < 60){
            score = (int) (Math.sqrt(score) * 10);
        }
        if (score >= 90 && score <= 100){
            GPA = 4.0;
        }else if(score >= 60 && score < 90) {
            GPA = 4.0;
            for (int i = 89; i >= 60 ; i--) {
                GPA -= 0.1;
                if (score == i){
                    break;
                }
            }
        }
        System.out.println(String.format("%.1f",GPA));
    }
}
