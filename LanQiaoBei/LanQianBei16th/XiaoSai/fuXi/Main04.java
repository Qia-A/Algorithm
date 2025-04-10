package LanQianBei16th.XiaoSai.fuXi;

import java.util.Scanner;


/**
 * 编写一个程序，提示用户输人一个十六进制数，显示其对应的二进制数。
 * @author QIA
 * @create 2024-11-30-12:23
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入十六进制数：");
        String hex = sc.next();

        System.out.println((isHex(hex)) ? "二进制为："+binaryValue(hex) :
                hex + "不是十六进制数");
    }

    // 判断是否为十六进制
    public static boolean isHex(String hex) {
        int digit;
        try {    //字符串直接转换为数字，存在字符时会自动抛出异常
            digit = Integer.parseInt(hex);
        } catch (Exception e) {    //字符串存在字母时，捕获异常并转换为数字
            digit = hex.charAt(0) - 'A' + 10;
        }
        return (0 < digit && digit <= 15) ? true : false;
    }

    // 获取二进制
    public static String binaryValue(String hex){
        // 创建字符串缓冲器
        StringBuffer stringBuffer = new StringBuffer(6);
        int digit;
        try {
            digit = Integer.parseInt(hex);
        }catch(Exception e){
            digit = hex.charAt(0) - 'A' + 10;
        }

        while(digit != 0) {
            stringBuffer.append(digit % 2);
            digit /= 2;
        }

        // 二进制长度小于4时补0
        while(stringBuffer.length() < 4) stringBuffer.append(0);
        return stringBuffer.reverse().toString();  // 返回逆转的字符串
    }
}
