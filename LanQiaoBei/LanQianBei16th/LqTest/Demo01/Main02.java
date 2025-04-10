package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;



/**
 * 每日真题 2117 砍竹子
 * @author QIA
 * @create 2024-12-02-12:55
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 用于记录竹子数量。
        long[][] num = new long[n + 1][10]; // 用于记录每棵竹子每次魔法高度和原始高度，逆序存放
        long[] std = new long[10];  //  用于临时存放每棵竹子的每次高度变化。
        long count = 0;  // 初始化计数器count，表示使用魔法次数

        for (int i = 1; i <= n; i++) {  // 遍历每个竹子
            int top = 0;  // std数组索引
            long h = sc.nextLong();  // 录入竹子高度
            std[top] = h;  // 将初始高度存入std数组
            while (h > 1){
                top++;
                h=sqrt(h/2+1); // 开根号
                std[top]=h; // 将新的高度存入std数组
            }
            for(int j=0,k=top-1;k>=0;k--,j++){ // 逆序录入每棵竹子高度变化
                num[i][j]=std[k];
            }
            count+=top; // 将当前竹子的高度序列长度加到count上，＝对每个竹子单独使用了魔法，把所有的次数累加到一起
        }

        // 遍历二维数组num，检查相邻竹子之间是否有相同的高度，如果有则减少count，
        // ＝判断不同竹子是否有相同的高度时刻，魔法次数减1
        for(int i=0;i<10;i++){ // 遍历高度序列的每一位
            for(int j=2;j<=n;j++){ // 从第二个竹子开始遍历
                if(num[j][i]>0&&num[j][i]==num[j-1][i])count--;
            }
        }

        System.out.println(count);
    }

    // 自定义的求平方根的函数，用于替代Math.sqrt，因为Math.sqrt不支持long类型
    public static long sqrt(long h){
        long x=0; // 初始化结果x
        long start=1L,end=(long)1e9,mid=0; // 初始化二分查找的起始、结束和中间值
        while(start<=end){ // 二分查找平方根
            mid=(start+end)/2; // 计算中间值
            if(mid*mid<=h){ // 如果中间值的平方小于等于h
                x=mid; // 更新结果x
                start=mid+1; // 缩小查找范围到右半部分
            }
            else end=mid-1; // 否则缩小查找范围到左半部分
        }
        return x;
    }
}
