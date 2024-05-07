public class Count_Good_Nodes_in_Binary_Tree {
    
    public static int res = 0;

    public static int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }

        return countRes(root, root.val);
    }

    public static int countRes(TreeNode root, int max) {
        if(root == null) {
            return res;
        }

        if(root.val >= max) {
            max = root.val;
            res++;
        } 

        countRes(root.left, max);
        countRes(root.right, max);

        return res;
    }

    public static void main(String[] args) {
        
    }
}
