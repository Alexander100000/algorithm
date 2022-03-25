import java.util.ArrayList;
import java.util.List;
/*
* 二叉树后序遍历(递归)
*
*
* */
public class Main145 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(9, null, null);
        TreeNode node6 = new TreeNode(8, null, null);
        TreeNode node5 = new TreeNode(2, node7, node6);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node5, node4);
        TreeNode node1 = new TreeNode(1, node3, node2);
        System.out.println(postorderTraversal(node1));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        inorder(root, integers);
        return integers;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        inorder(root.right, list);
        list.add(root.value);
    }
}