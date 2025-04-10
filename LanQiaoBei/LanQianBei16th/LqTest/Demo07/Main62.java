package LanQianBei16th.LqTest.Demo07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3645  守护博士
 * @author QIA
 * @create 2025-04-05-22:01
 */
public class Main62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //思路 想要找到小怪移动的最远位置的最小值
        //第is 第n只小怪的位置是s[n]+t[n]*i现在需要使得这个值最小
        //杀完所有小怪需要n s
        //定义两个边界 通过二分查找法找出能满足题意的最大位移
        int n =scan.nextInt() ;
        long[] s = new long[n];
        long[] t = new long[n];
        for(int i=0;i<n;i++) {
            s[i]=scan.nextLong();
            t[i]=scan.nextLong();
        }
        //设置二分边界，防止溢出
        long left=1,right=Long.MAX_VALUE/2;
        long mid=0;
        while(left<right) {
            mid = (left+right)/2;
            if(check(mid,s,t)) {
                right=mid;
            }else {
                left=mid+1;
            }
        }
        System.out.println(left);
        scan.close();
    }
    //当前mid条件下无法满足条件的返回false
    public static boolean check(long mid,long[] s,long[] t) {
        //定义一个数组来记录海嗣的存活时间
        long[] time = new long[s.length];
        //判断
        for(int i=0;i<s.length;i++) {
            if(mid<s[i]) {
                //如果海嗣的位置大于mid说明mid错误
                return false;
            }
            //记录海嗣在当前mid条件下可以存活的时间
            time[i]=(mid-s[i])/t[i];
        }
        Arrays.sort(time); // 升序排序time小的优先处理
        for(int i=0;i<time.length;i++) {
            if(time[i]<i) {
                //当规定的时间没有杀死对应的海斯，返回错误
                return false;
            }
        }
        return true;
    }
}
