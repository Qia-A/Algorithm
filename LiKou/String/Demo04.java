package Contest_23.LiKou.String;

import java.util.Scanner;

/**
 * 力扣415 字符串相加
 * 链接：https://leetcode.cn/problems/add-strings/
 * 题目：给定两个字符串形式的非负整数num1 和num2，计算它们的和并同样以字符串形式返回。
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger），也不能直接将输入的字符串转换为整数形式。
 * 示例1：
 *  输入：num1 = "456", num2 = "77"
 *  输出："533"
 * 提示：
 *  1 <= num1.length, num2.length <= 104
 *  num1 和num2 都只包含数字 0-9
 *  num1 和num2 都不包含任何前导零
 *
 * @author QIA
 * @create 2023-01-03-19:05
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num1 = s.next();
        String num2 = s.next();

        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        //用来记录进位
        int w = 0;
        //记录两个字符串的长度
        int len1 = num1.length(),len2 = num2.length();
        //对应俩字符串长度的最小和最大值
        int mn = Math.min(len1,len2),mx = Math.max(len1,len2);
        //遍历两个字符串尾部对齐的共同部分
        for(int m = 0; m < mn;m++){
            //获取第一个字符串最后一位对应的数值，同时指针往前移动一步
            int i = num1.charAt(len1 - 1) - '0';
            len1--;
            //获取第二个字符串最后一位对应的数值，同时指针往前移动一步
            int j = num2.charAt(len2 -1) - '0';
            len2--;
            int sum = i + j + w;
            //获取进位
            w = sum / 10;
            //加入到结果字符串中
            s.append(sum % 10);
        }
        //遍历剩余较长的字符串的前半部分
        for(int n = 0;n < mx - mn; n++){
            if(len1 > 0){//第一个字符串较长的情况
                int i = num1.charAt(len1 - 1) - '0';
                len1--;
                int sum = i + w;
                w = sum / 10;
                s.append(sum % 10);
            }else if(len2 > 0){//第二个字符串较长的情况
                int j = num2.charAt(len2 -1) - '0';
                len2--;
                int sum = j + w;
                w = sum / 10;
                s.append(sum % 10);
            }
        }
        //无论哪个更长或者相同，最后都可能产生进位，要判断是否产生进位，加上进位
        if(w != 0){
            s.append(w);
        }
        //因为是正方向防止的要逆序，而且要转换为String类型
        return s.reverse().toString();
    }
}
