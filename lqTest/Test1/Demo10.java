package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 天干地支
 * 题目描述：古代中国使用天干地支来记录当前的年份
 *  天干一共有十个，分别为: 甲 (ia)、乙 (yi) 、丙(bing) 、丁(ding)、戊(wu)、己() 、庚(geng)、辛 (xin)、王(ren)、类(gui) 。
 *  地支一共有十二个，分别为: 子(zi) 、丑 (chu) 、(yin)、卯(mao)、辰(chen)、已(si)、午 (wu)、未(wei) 、申(shen)、酉(you)、成(x) 、亥(hai) 。
 *  将天干和地支连起来，就组成了一个天干地支的年份，例如:甲子。 2020年是庚子年
 *  每过一年，天干和地支都会移动到下一个。例如2021年是辛丑年
 *  每过60年，天干会循环6轮，地支会循环5轮，所以天干地支纪年每60年轮回一次。例如1900 年，1960年，2020年都是庚子年
 *  给定一个公元纪年的年份，请输出这一年的天干地支年份。
 * 输入描述：
 *    输入一行包含一个正整数，表示公元年份其中有，输入的公元年份为不超过9999的正整数
 * 输出描述：
 *    输入一行包含一个正整数，表示公元年份
 * 输入输出样例
 * 输入：2020
 * 输出：gengzi
 * 运行限制
 *     最大运行时间: 1s
 *     最大运行内存:128M
 * @author QIA
 * @create 2023-03-06-17:05
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] tg = {"jia","yi","bing","ding","wu","ji","geng","xin","ren","gui"};
        String[] dz = {"zi","chou","yin","mao","chen","si","wu","wei","shen","you","xu","hai"};
        int year = s.nextInt();

        System.out.println(tgdz(tg,dz,year));
    }
    public static String tgdz(String[] tg,String[] dz, int year) {
        // 已知每 60 年一轮回，1900、1960、2020都是庚子年，遍历即可
        if(year == 1900 || year == 1960 || year == 2020) {
            return "gengzi";
        }
        int tgnum = 6;
        int dznum = 0;
        if (year > 1960){
            for (int i = 1960; i < year; i++) {
                if (tgnum == 9) tgnum=0;
                else tgnum++;
                if (dznum == 11) dznum=0;
                else dznum++;
            }
        }else {
            for (int i = year; i < 1960; i++) {
                if (tgnum == 0) tgnum = 9;
                else tgnum--;
                if(dznum == 0) dznum = 11;
                else dznum--;
            }
        }
        return tg[tgnum] + dz[dznum];
    }
}
