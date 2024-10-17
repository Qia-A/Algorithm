package Contest_23.LiKou.List;

/**
 * 力扣203 移除链表元素
 * https://leetcode.cn/problems/remove-linked-list-elements/
 * 题目：给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足Node.val == val的节点，并返回新的头节点 。
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 *
 * @author QIA
 * @create 2022-12-27-16:10
 */
public class Demo01 {
    public static void main(String[] args) {
        // 测试数据：1, 2, 6, 3, 4, 5, 6      6



//        removeElements(next,val);
    }
    //定义链表初始化
    public static class ListNode {
        //结点的值
        int val;

        //下一个结点
        ListNode next;

        // 节点的构造函数(有两个参数)
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    /**
     * 不添加虚拟节点方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val){
        while (head != null && head.val == val) {
            head = head.next;
        }
        //已经为null，提前退出
        if (head == null) {
            return head;
        }
        //已确定当前head.val ！= val
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    /**
     * 添加虚节点方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
