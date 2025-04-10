package LanQianBei16th.LqTest.Demo07;

/**
 * 弹珠堆放
 * @author QIA
 * @create 2025-04-09-10:24
 */
public class Main70 {
    public static void main(String[] args) {
        int sum = 1;
        // hight为当前层数，num为当前层数需要弹珠数
        int hight = 2,count=1;
        while (sum <= 20230610){
            count += hight;
            sum += count;
            ++hight;

        }
        System.out.println(hight-2);
    }
}
