package LiKou.Binarytree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树
 * 力扣144 二叉树的前序遍历
 * https://leetcode.cn/problems/binary-tree-preorder-traversal/
 * 给你二叉树的根节点root，返回它节点值的前序遍历。
 *
 * @author QIA
 * @create 2022-11-22-20:12
 */
public class Demo01 {
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
//        if (root == null){
//            return levelOrder;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<Integer>();
//            queue.offer(root);
//            while (!queue.isEmpty()) {
//                List<Integer> level = new ArrayList<Integer>();
//                int size = queue.size();
//                for (int i = 0;i < size; i++){
//                    TreeNode node = queue.poll();
//                    level.add(node.val);
//                    TreeNode left = node.left,right = node.right;
//                    if(left != null) {
//                        queue.offer(left);
//                    }
//                    if (right != null) {
//                        queueeue.offer(right);
//                    }
//                }
//                levelOrder.add(0,level);
//            }
//        }
//        return levelOrder;
//    }
//
    public static void main(String[] args) {
//        //测试用例
//        class TreeNode {
//            int val;
//            TreeNode left;
//            TreeNode right;
//            TreeNode() {}
//            TreeNode(int val) {this.val = val; }
//            TreeNode(int val,TreeNode left,TreeNode right) {
//                this.val = val;
//                this.left = left;
//                this.right = right;
//            }
//        }
//
//        TreeNode root = {3,9,20,null,null,15,7};
    }
}
