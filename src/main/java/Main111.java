import java.util.LinkedList;
import java.util.Queue;

/*
 * 二叉树的最小深度
 *
 * */
public class Main111 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, node7);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, node6);
        TreeNode node2 = new TreeNode(2, node5, node4);
        TreeNode node1 = new TreeNode(1, node3, node2);
        System.out.println(minDepth(node1));
        System.out.println(minDp(node1));
    }

    //按照给的用例可以画个图
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
//       这个表示来到了叶子节点，叶子节点标位1，父子节点+1
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
//       遍历左子树
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
//       遍历右子树
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }

        return min + 1;
    }

    //    利用队列（先进先出的队列）广度优先,维护一个deep
    public static int minDp(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        root.deep = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
           TreeNode node= queue.poll();
            if (node.right==null&&node.left==null) {
                return node.deep;
            }
            if(node.left!=null){
                node.left.deep= node.deep+1;
                queue.offer(node.left);
            }
            if(node.right!=null){
                node.right.deep= node.deep+1;
                queue.offer(node.right);
            }
        }
        return 0;
    }


}

class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;
    int deep;

    public TreeNode(int value, TreeNode right, TreeNode left) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {

    }

}