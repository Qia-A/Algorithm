package Contest_23.LanQiaoBei14th.Review;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组操作
 *
 * @author QIA
 * @create 2023-03-06-23:34
 */
public class Demo01 {
    public static void main(String[] args) {

        //声明数组
        int[] a=new int[10]; //首选
        int b[]=new int[10]; //C/C++形式，效果相同，但不是最好的选择
        int[] c={2,5,14,5,3}; //创建并初始化

        int[][] d=new int[5][2]; // 二维数组
        // 复制数组 b复制c的数组
        b = c.clone();
        System.out.println(Arrays.toString(b));

        //实用一
        int[] arr = new int[5];//新建一个大小为5的数组
        Arrays.fill(arr,4);//给所有值赋值4
        String str = Arrays.toString(arr); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(str);
        //输出：[4, 4, 4, 4, 4]

        //实用二
        int[] arr1 = new int[5];//新建一个大小为5的数组
        Arrays.fill(arr1,2,4,6);//[2,4) 下标从0开始。下标为2（包括）到下标为4（不包括）全部赋值为6
        String str1 = Arrays.toString(arr1); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(str1);
        //输出：[0, 0, 6, 6, 0]

        // 排序
        String[] strArray = new String[] { "z", "a", "C" };
        Arrays.sort(strArray);
        //输出： [C, a, z]
        System.out.println(strArray);

        // 反向排序
        String[] strArray1 = new String[] { "z", "a", "C" };
        Arrays.sort(strArray1, Collections.reverseOrder());
        //输出：[z, a, C]

    }
}
