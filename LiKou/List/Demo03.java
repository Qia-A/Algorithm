package Contest_23.LiKou.List;

/**
 * 力扣876  链表的中间节点   链表、指针
 * 链接：https://leetcode.cn/problems/middle-of-the-linked-list/
 * 题目：给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 *      如果有两个中间结点，则返回第二个中间结点。
 * 示例1： 输入：head = [1,2,3,4,5];  输出：[3,4,5]  解释：链表只有一个中间节点，值为 3.
 * 示例2： 输入：head = [1,2,3,4,5,6] 输出：[4,5,6]  解释：该链表有两个中间结点，值分别为 3 和 4 ，返回第二个结点。
 * 提示：
 *     ·链表的结点数范围是 [1, 100]
 *     ·1 <= Node.val <= 100
 *
 * @author QIA
 * @create 2023-03-13-11:49
 */
public class Demo03 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode(int[] nums) {
            if (nums == null || nums.length == 0) {
                throw new IllegalArgumentException("arr can not be empty");
            }
            this.val = nums[0];
            ListNode curr = this;
            for (int i = 1; i < nums.length; i++) {
                curr.next = new ListNode(nums[i]);
                curr = curr.next;
            }
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            ListNode cur = this;
            while (cur != null) {
                s.append(cur.val);
                s.append(" -> ");
                cur = cur.next;
            }
            s.append("NULL");
            return s.toString();
        }
    }

    public static class Solution {

        public ListNode middleNode(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6};
            // int[] arr = new int[]{1, 2, 3, 4, 5};
            ListNode head = new ListNode(arr);
            Solution solution = new Solution();
            ListNode res = solution.middleNode(head);
            System.out.println(res);
        }
    }
}
