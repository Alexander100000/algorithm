public class MainOffer07 extends Object{
    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int n = preorder.length;
        int m = inorder.length;
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
             if(preorder[0]==inorder[j]){

             }
        }
        return root;
    }

}
