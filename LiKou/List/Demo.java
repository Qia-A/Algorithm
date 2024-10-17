package Contest_23.LiKou.List;

/**
 * 链表初始化
 * @author QIA
 * @create 2022-12-27-16:27
 */
public class Demo {
    //定义链表初始化
    public class ListNode {
        //结点的值
        int val;

        //指向下一个结点
        ListNode next;

        //节点的构造函数（无参）
        public ListNode(){
        }

        //节点的构造函数（有一个参数）
        public ListNode(int val){
            this.val = val;
        }

        //节点的构造函数（有两个参数）
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
