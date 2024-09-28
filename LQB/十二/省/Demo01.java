package Competition.lanqiao.LQB.十二.省;

/**
 * 十二届 省赛 Java C组 试题C: 卡片
 * 题目：小蓝有很多数字卡片，每张卡片上都是数字 0 到9.
 * 小蓝准备用这些卡片来拼一些数，他想从 1 开始拼出正整数，每拼一个，就保存起来，卡片就不能用来拼其它数了。
 * 小蓝想知道自己能从 1 拼到多少
 * 例如，当小蓝有 30 张卡片，其中 0到9各3张，则小蓝可以拼出1到10但是拼 11 时卡片1 已经只有一张了，不够拼出 11.
 * 现在小蓝手里有0到9 的卡片各 2021 张，共 20210 张，请问小蓝可以从 1 拼到多少?
 * 运行限制：
 *      最大运行时间：1s
 *      最大运行内存：128M
 *
 * @author QIA
 * @create 2023-03-02-21:55
 */
public class Demo01 {
    public static void main(String[] args) {
        // 0-9 卡片每种都有 2021 张，请问可以拼到多少？
        // 定义拼到的值，
        int num = 0;
        int[] arr = {2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021};
        String s = "";
        //  out:for(int i = 1;;i++) {}  out是指对for循环做标记，用来区分内外层循环
        yy:for (int i = 1;;i++) {
            s = i+"";
            for (int j = 0;j < s.length(); j++) {
                int il = Integer.parseInt(String.valueOf(s.charAt(j)));
                // 当这个卡片剩余为0，跳出循环
                if(arr[il] == 0) {
                    // 将i就是拼到的数值
                    num = i;
                    break yy;
                }else {
                    arr[il]--;
                }
            }
        }
        // 最后输出时应剪掉拼不成的那一个
        System.out.println(num - 1);
    }
}