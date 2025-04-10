package LanQianBei16th.LqTest.Demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 分布式队列
 * @author QIA
 * @create 2025-03-09-14:09
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 用于装下主节点和副节点，长度为n
        ArrayList<List<Long>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        while (sc.hasNext()){
            // 获取输入的操作
            String cao = sc.next();
            switch (cao) {
                case "add":
                    long element = sc.nextLong();
                    List<Long> headQueue = list.get(0);
                    headQueue.add(element);
                    break;
                case "sync":
                    int queueIndex = sc.nextInt(); // 需要同步的队列
                    syncData(list.get(0), list.get(queueIndex));
                case "query":
                    // 由于队列式是有序的同步数据，我们只需要获取最凶阿德队列的长度即可
                    int len = list.get(0).size(); // 初始化为最大个数，即头节点拥有元素的个数
                    for (int j = 1; j < list.size(); j++) {
                        len = Math.min(list.get(j).size(), len);
                    }
                    System.out.println(len);
                    break;
            }
        }
        sc.close();
    }

    public static void syncData(List<Long> headQueue, List<Long> fuQueue) {
        // 检查出缺失的元素，无需便利判断（副节点与头节点要么完全相等，要么差数据，并不会存在元素不相等的情况）
        if (headQueue.size() != fuQueue.size()){
            int lackIndex = fuQueue.size() % headQueue.size(); // 利用取模运算，可以得到所缺数据的第一个索引
            fuQueue.add(headQueue.get(lackIndex)); // 将头结点这个数据添加到副节点即可
        }
    }
}
