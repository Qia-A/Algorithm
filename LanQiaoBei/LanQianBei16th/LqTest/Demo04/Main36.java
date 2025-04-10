package LanQianBei16th.LqTest.Demo04;

import java.util.Scanner;

/**
 * 762  求先序排列
 * @author QIA
 * @create 2025-03-19-12:31
 */
public class Main36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inorder = sc.nextLine(); // 中序遍历
        String postorder = sc.nextLine(); // 后序遍历
        sc.close();

        // 构建先序遍历
        String preorder = buildPreorder(inorder,postorder);

        // 输出结果
        System.out.println(preorder);
    }

    private static String buildPreorder(String inorder, String postorder) {
        if (inorder.isEmpty() || postorder.isEmpty()) {
            return "";
        }

        // 后序遍历的最后一个字符的根节点
        char root = postorder.charAt(postorder.length() - 1);
        int rootIndex = inorder.indexOf(root);  // 找到根节点在中序遍历中的位置

        // 分割中序遍历为左子树和右子树
        String inorderLeft = inorder.substring(0, rootIndex);
        String inorderRight = inorder.substring(rootIndex + 1);

        // 分割后序遍历为左子树和右子树
        String postorderLeft = postorder.substring(0, rootIndex);
        String postorderRight = postorder.substring(rootIndex, postorder.length() - 1);

        // 先序遍历为根节点 + 左子树的先序遍历 + 右子树的先序遍历
        return root + buildPreorder(inorderLeft, postorderLeft) + buildPreorder(inorderRight, postorderRight);
    }
}
