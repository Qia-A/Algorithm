package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 试题 算法训练24点
 *  24点游戏是一个非常有意思的游戏，很流行，玩法很简单：
 *  给你4张牌，每张牌上有数字（其中A代表1，J代表11，Q代表12，K代表13），
 *  你可以利用数学中的加、减、乘、除以及括号想办法求出不超过24的最大值。
 * 输入格式
 * 　输入第一行N(1<=N<=5)表示有N组测试数据。每组测试数据输入4行，每行一个整数(1到13)表示牌值。
 * 输出格式
 * 　每组测试数据输出一个整数，表示所能得到的最大的不超过24的值。
 *
 * @author QIA
 * @create 2023-01-07-14:08
 */
public class Demo04 {

    static int N,vis[],arr[],max,pos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //表示有N组数据，每组数据输入4行
        N = sc.nextInt();
        int[][] num = new int[N][4];
        vis = new int[4];
        arr = new int[4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            max = 0;
            Dfs(1,num[i]);
            System.out.println(max);
        }
    }

    static int VF(int a,int b,int h){
        switch (h){
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
        }
        if (b == 0){
            return 1000;
        }
        if(a % b != 0){
            return 1000;
        }
        return a/b;
    }

    static void Dfs(int step, int[] num) {
        for (int i = 0; i < 4; i++) {
            if (vis[i] == 0){
                vis[i] = 1;
                arr[pos++] = num[i];
                Dfs(step+1,num);
                vis[i] = 0;
                arr[--pos] = 0;
            }
        }
        if (step > 4){
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    for (int k = 1; k <= 4; k++) {
                        int tp1,tp2,tp3;
                        tp1 = VF(arr[0],arr[1],i);
                        tp2 = VF(tp1,arr[2],j);
                        tp3 = VF(tp2,arr[3],k);
                        if(tp3 <= 24) max = Math.max(max, tp3);
                        tp1 = VF(arr[1],arr[2],j);
                        tp2 = VF(arr[0],tp1,i);
                        tp3 = VF(tp2,arr[3],k);
                        if(tp3 <= 24) max = Math.max(max, tp3);
                        tp1 = VF(arr[1],arr[2],j);
                        tp2 = VF(tp1,arr[3],k);
                        tp3 = VF(arr[0],tp2,i);
                        if(tp3 <= 24) max = Math.max(max, tp3);
                        tp1 = VF(arr[0],arr[1],i);
                        tp2 = VF(arr[2],arr[3],k);
                        tp3 = VF(tp1,tp2,j);
                        if(tp3 <= 24) max = Math.max(max, tp3);
                        tp1 = VF(arr[2],arr[3],k);
                        tp2 = VF(arr[1],tp1,j);
                        tp3 = VF(arr[0],tp2,i);
                        if(tp3 <= 24) max = Math.max(max, tp3);
                    }
                }
            }
        }
    }
}
