package Contest_23.LiKou.String;

/**
 * 字符串
 * 力扣168 Excel表列名称
 * https://leetcode.cn/problems/excel-sheet-column-title/
 * 给你一个整数columnNumber，返回它在Excel表中相对应的列名称。
 *
 * @author QIA
 * @create 2022-11-20-23:38
 */
public class Demo02 {
    public static String converToTitle(int n){
        StringBuilder str = new StringBuilder();
        //判断它在表中对应的列名称
        while (n > 0) {
            n -= 1;
            int c = n % 26;
            str.insert(0,(char)('A' + c));
            n /= 26;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        //测试用例
        int columnNumber = 29;
        System.out.println(converToTitle(columnNumber));
    }
}
