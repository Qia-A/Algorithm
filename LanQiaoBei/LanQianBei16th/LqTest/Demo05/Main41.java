package LanQianBei16th.LqTest.Demo05;

import java.util.Scanner;

/**
 * 753 选树
 * @author QIA
 * @create 2025-03-19-19:06
 */
public class Main41 {
    static int[] flat;
    static int ans = 0; // 记录数值相加的和
    static int count = 0; // 素数个数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        flat = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 递归排列
        DFS(k,arr,0,0);
        System.out.println(count);
    }

    private static void DFS(int k,int[] nums, int recode, int index){
        // 判断当前递归路径是否已选择了k个数字
        if (recode == k){
            if (prime(ans)){
                count++;
                return;
            }
            return;
        }
        // 遍历整个数组
        for (int i = index; i < nums.length; i++) {
            // 判断当前数字是否被访问过
            if (flat[i] != 1){
                flat[i] = 1; // 标记已访问
                ans += nums[i]; // 将该数字加入
                DFS(k, nums, recode+1, i+1);  // 递归调用
                ans -= nums[i]; // 回溯，撤销数字的加入
                flat[i] = 0; // 回溯，撤销标记
            }
        }
    }

    // 判断是否为素数
    private static boolean prime(int num){
        // 如果num不是素数，那它的一个因数肯定小于等于他的平方根
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
