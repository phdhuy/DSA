public class Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int rightDepth = maxDepth(root.right);
        int leftDepth = maxDepth(root.left);
        int res = Math.max(rightDepth, leftDepth) + 1;

        return res;
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);

        n0.left = n1;
        n0.right = n2;
        n2.left = n3;
        n2.right = n4;

        System.out.print(maxDepth(n0));
    }
}
