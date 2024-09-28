package Competition.lanqiao.lqTest.Test1;

import java.util.*;

/**
 * 算法训练  预备爷的悲剧  字符串
 * 题目：英语预备爷gzp是个逗(tu)比(hao)，为了在即将到来的英语的quiz中不挂科，gzp废寝忘食复习英语附录单词表，俨然一场人间悲剧。
 * 不过上天有好生之德，上帝扔给了gzp一张纸，上面记载了将要考到的单词。不过gzp是个逗比，之前复习的东西全忘记了，所以他又要再来一次复习。
 * 不过已经知道了要考的单词，所以不需要复习单词表的所有页数。因此，现在需要你帮助他求出有多少页纸需要复习。
 * 他会告诉你每个单词会在哪几页出现，并且告诉你要考哪些单词，你只要告诉他答案就可以了。
 * 由于一个单词会出现在不同页上，只需要复习在最前面一页上的就可以了。
 *
 * 输入格式：  第一行一个整数n，表示单词附录有n个单词。
 * 接下来n行每行一个小写字母组成的单词和一个整数，表示某一个单词和它所在的页数。
 * 接下来是一行整数m，表示要考m个单词，
 * 接下来m行小写字母组成的单词，表示要考到的单词。
 *
 * 输出格式：一个数，表示需要复习的页数。
 *
 * 样例输入：
 * 5
 * ab 1
 * ac 2
 * ab 2
 * ac 3
 * c 3
 * 3
 * ab
 * ac
 * c
 *
 * 样例输出：
 * 3
 *
 * 数据规模和约定：
 *     0<=n,m<=100000，单词长度<=10。
 *
 * @author QIA
 * @create 2023-02-23-20:35
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 创建 Set 集合用来保存需要复习的页数
        Set<Integer> set = new HashSet<>();
        // 单词表中单词的录入
        int n = s.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0;i < n; i++) {
            // 录入单词以及所在的页数
            String key = s.next();
            int value = s.nextInt();
            // 这里判断 key 是否出现，如果没出现过直接保存到单词表，如果出现过判断 value 值，保存小的那个
            // containsKey() 方法检查 hashMap 中是否存在指定的 key 对应的映射关系。存在返回true
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else {
                if (map.get(key)>value) {
                    map.put(key, value);
                }
            }
        }
        // 录入需要考试的单词
        int m = s.nextInt();
        String[] str = new String[m];
        for (int i = 0; i < m; i++) {
            // 输入要考试的单词
            str[i] = s.next();
            // 判断这个单词是否在单词表中
            if (map.containsKey(str[i])) {
                // 如果在单词表中则把单词对应的 value 值保存到 Set 中去
                set.add(map.get(str[i]));
            }
        }
        // 调度 size 方法得到需要复习的页数
        System.out.println(set.size());
    }
}
