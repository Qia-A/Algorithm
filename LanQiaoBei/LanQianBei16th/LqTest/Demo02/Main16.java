package LanQianBei16th.LqTest.Demo02;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 花束搭配【算法赛】
 * 运行超时
 * @author QIA
 * @create 2025-03-08-20:02
 */


public class Main16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// 鲜花种类
        long []arr=new long[n];// A鲜花的艳丽度
        long []brr=new long[n];// B鲜花的艳丽度
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            brr[i]=sc.nextLong();
        }
        long[]sum=new long[n]; // AB两种鲜花的艳丽度值差A-B
        for (int i = 0; i < n; i++){
            sum[i]=arr[i]-brr[i];
        }
        Arrays.sort(sum);
        int zuo=0;  // 左边的索引
        int you=n-1; // 右边的索引
        long daan=0; // 存储当前符合的方案数
        /**
         * 初始化两个指针 left 和 right 分别指向 diff 数组的起始和末尾位置。
         * 在 while 循环中，根据 diff[left] + diff[right] 的值进行判断和操作。
         * 如果和大于 0，则将 right - left 的值累加到 ans 中，并将 right 指针左移一位；
         * 如果和不大于 0，则将 left 指针右移一位。
         */
        while (zuo<you) {
            if(sum[you]+sum[zuo]>0){
                // 因为sum是从小到大，所以如果sum[you]+sum[zuo]>0的话
                // 那么sum[zuo]+sum[大于you的索引]全都符合相加大于0
                daan+=you-zuo;
                // 更新you 表示用下一个去检验
                you--;
            }else {
                // 说明不符合，所以要增大zuo这样sun[zuo]才会大
                // 才可能使sum[you]+sum[zuo]>0
                zuo++;
            }
        }
        // 最后记得daan*2因为 (j,i)和(j,i) 被视为不同的组合。
        System.out.println(daan*2);
    }
}