package LanQianBei16th.LqTest.Demo06;

import java.util.*;

/**
 * 179  日志统计
 * @author QIA
 * @create 2025-04-04-11:42
 */
public class Main57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 表示日志数量
        int d = sc.nextInt(); // 表示时间间隔
        int k = sc.nextInt(); // 表示最小频率
        // 创建一个哈希map，用于存储日志的ID和对应的时间戳列表
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        // 创建一个优先队列，用于存储日志的id，按照默认的自然顺序进行排序（输出格式为从小到大）
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0,t,id; i < n; i++) {
            t=sc.nextInt(); // 表示时间
            id=sc.nextInt(); // 表示日志id
            if (map.get(id) == null) { // 如果map中不存在该id对应的时间列表，就创建一个新的列表，
                // 并将该id添加到queue中
                map.put(id, new ArrayList<>());
                queue.add(id);
            }
            map.get(id).add(t); // 将时间t添加到该id对应的时间列表中
        }

        while (!queue.isEmpty()) {
            int id = queue.poll();  // 从queue中取出一个日志id
            ArrayList<Integer> list = map.get(id);  // 从map中获取该id对应的时间列表
            list.sort(Comparator.naturalOrder());  // 使用自然顺序对列表进行排序

            // 设计lf到rt有k位，若排序后这k位（时间间隔）小于规定间隔d，则符合要求
            for (int lf = 0, rt=k-1; rt < list.size(); lf++,rt++) {
                if (list.get(rt)-list.get(lf) < d) {
                    System.out.println(id);
                    break;  // 跳出循环，避免重复输出id
                }
            }
        }
    }
}
