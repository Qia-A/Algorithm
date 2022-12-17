package LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣744 寻找比目标字母大的最小字母
 * https://leetcode.cn/problems/find-smallest-letter-greater-than-target/
 * 给你一个排序后的字符列表letters，列表中只包含小写英文字母。另给出一个目标字母target，请你寻找在这一有序列表里比目标字母大的最小字母。
 * 在比较时，字母是依序循环出现的。举个例子：
 *    如果目标字母target = 'z'并且字符列表为letters = ['a', 'b']，则答案返回'a'
 *
 *
 * @author QIA
 * @create 2022-11-17-22:23
 */
public class Demo10 {
    public static char nextGreatestLetter(char[] letters, char target) {
        char res = ' ';
        int min = 0;
        for (char c: letters) {
            int temp = c - target;
            if (temp > 0) {
                if(min == 0 || min > 0 && temp < min){
                    min = temp;
                    res = c;
                }
            }
        }
        if (min > 0){
            return res;
        }
        for (char c : letters){
            int temp = c - target;
            if (temp < 0){
                if(min == 0 || min < 0 && temp < min){
                    min = temp;
                    res = c;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //测试用例
        char[] letters = {'c','f','j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
