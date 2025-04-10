package LanQianBei16th.LqTest.Demo02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 17 排列序数
 * @author QIA
 * @create 2025-03-09-23:58
 */
public class Main20 {

    static public List<String> list=new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        char[] ch=s.toCharArray();//把字符串转换成数组字符
        f(ch,0,s.length()-1);
        Collections.sort(list);//排列
        for (String s1 : list) {
            if(s1.equals(s))//遍历集合匹配
            {
                System.out.println(list.indexOf(s1));
                break;
            }
        }
    }
    //全排列,列出所有情况
    public static void f(char[] ch, int l, int r)
    {
        if (l==r)
        {
            list.add(String.valueOf(ch));
        }
        else {
            for (int i = l; i <= r; i++) {
                swap(ch, l, i);
                f(ch, l + 1, r);
                swap(ch, l, i);
            }
        }
    }

    public static void swap(char[] ch,int i,int j)
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}