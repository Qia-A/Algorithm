package LanQianBei16th.LqTest.Demo07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-04-08-23:37
 */
public class Main69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];  // 存储每个事件对x的影响
        int[] b = new int[n];  // 存储每个事件对y的影响
        int[] c = new int[n];  // 存储每个时间对z的影响
        for(int x=0;x<n;x++) {
            a[x]=sc.nextInt();//读取第i个事件对x的影响
        }
        for(int y=0;y<n;y++) {
            b[y]=sc.nextInt();//读取第i个事件对y的影响
        }
        for(int z=0;z<n;z++) {
            c[z]=sc.nextInt();//读取第i个事件对z的影响
        }

        for (int i = 0; i < n; i++) {
            int m = a[i]; // 临时变量，存储原始的影响值
            int e = b[i];
            int f = c[i];
            a[i] = m-e-f;//对x的优势或劣势
            b[i]=e-m-f;//对y的优势或劣势
            c[i]=f-m-e;//对z的优势或劣势
        }

        Arrays.sort(a);//对数组a进行排序
        Arrays.sort(b);//对数组b进行排序
        Arrays.sort(c);//对数组c进行排序

        int d=-1;long sum=0,sun=0,sus=0;
        //初始化d为-1，表示没有任何国家获胜的情况
        for(int i=n-1;i>=0;i--) {//从后往前遍历数组
            sum+=a[i];//累加值
            sun+=b[i];
            sus+=c[i];
            if(sum>0||sun>0||sus>0) {
                //如果某个国家的优势和大于0，即大于另外两个国家的优势和
                d=n-i;//更新d的值
            }
        }
        System.out.println(d);
    }
}
