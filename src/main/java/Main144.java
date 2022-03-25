import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* 二叉树的前序遍历
*
* */
public class Main144 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node7, node6);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node5, node4);
        TreeNode node1 = new TreeNode(1, node3, node2);
        System.out.println(preorderTraversal(node1));

    }
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer>integers=new ArrayList<>();
         preorder(root,integers);
        return integers;
    }
    public static void preorder(TreeNode root, List<Integer>integers){
        if(root==null){
            return ;
        }
        integers.add(root.value);
        preorder(root.left,integers);
        preorder(root.right,integers);
    }
}
