package Competition.LuoGu.chuanzhibei;

import java.util.Scanner;

/**
 *
 *
 * @author QIA
 * @create 2022-11-19-15:24
 */
public class Text01 {
    public static void main(String[] args) {
        //输入
        Scanner s = new Scanner(System.in);
        String[] arr = new String[500];
        int sum = 0;
        for (int i = 0; ; i++) {
            arr[i] = s.next();
            sum = i;
            if(arr[i].equals("0")){
                break;
            }
        }
        //判断拼接  双指针
        for (int slow = 0; slow <= sum;slow++) {
            for (int fast = slow+1; fast <= sum;fast++){
                if (arr[slow].equals(arr[fast])){
                    arr[sum-1] = arr[fast];
                    sum--;
                }
            }
        }

        //输出
        for (int i = 0;i < sum; i++) {
            System.out.print(arr[i]);
        }
    }
}
