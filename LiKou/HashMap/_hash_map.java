package Contest_23.LiKou.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希表的基础使用
 * @author QIA
 * @create 2023-01-05-22:05
 */
public class _hash_map {
    /**
     * 哈希表常用操作
     * */
    public static void main(String[] args) {
        /* 初始化哈希表 */
        Map<Integer, String> map = new HashMap<>();

        /* 添加操作 */
        // 在哈希表中添加键值对 (key, value)
        map.put(12836, "小哈");
        map.put(15937, "小啰");
        map.put(16750, "小算");
        map.put(13276, "小法");
        map.put(10583, "小鸭");

        /* 查询操作 */
        // 向哈希表输入键 key ，得到值 value
        String name = map.get(15937);

        /* 删除操作 */
        // 在哈希表中删除键值对 (key, value)
        map.remove(10583);

        /**
         * 遍历哈希表
         */
        // 遍历键值对 key->value
        for (Map.Entry <Integer, String> kv: map.entrySet()) {
            System.out.println(kv.getKey() + " -> " + kv.getValue());
        }
        // 单独遍历键 key
        for (int key: map.keySet()) {
            System.out.println(key);
        }
        // 单独遍历值 value
        for (String val: map.values()) {
            System.out.println(val);
        }
    }

    /**
     * 哈希函数
     */
    /* 键值对 int->String */
    class Entry {
        public int key;     // 键
        public String val;  // 值
        public Entry(int key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    /* 基于数组简易实现的哈希表 */
    class ArrayHashMap {
        private List<Entry> bucket;
        public ArrayHashMap() {
            // 初始化一个长度为 100 的桶（数组）
            bucket = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                bucket.add(null);
            }
        }

        /* 哈希函数 */
        private int hashFunc(int key) {
            int index = key % 100;
            return index;
        }

        /* 查询操作 */
        public String get(int key) {
            int index = hashFunc(key);
            Entry pair = bucket.get(index);
            if (pair == null) return null;
            return pair.val;
        }

        /* 添加操作 */
        public void put(int key, String val) {
            Entry pair = new Entry(key, val);
            int index = hashFunc(key);
            bucket.set(index, pair);
        }

        /* 删除操作 */
        public void remove(int key) {
            int index = hashFunc(key);
            // 置为 null，代表删除
            bucket.set(index, null);
        }
    }
}
