public class Delete_Node_in_a_BST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }

        if(root.val == key) {
            if(root.left != null && root.right != null) {
                root.val = root.right.val;
                if(root.right.right != null) {
                    root.right = root.right.right;
                } else {
                    root.right = null;
                }
            } else if(root.left != null) {
                root.val = root.left.val;
                if(root.left.left != null) {
                    root.left = root.left.left;
                } else {
                    root.left = null;
                }
            } else if(root.left == null && root.right == null) {
                return null;
            }
        }

        deleteNode(root.left, key);
        deleteNode(root.right, key);

        return root;
    }

    public static void main(String[] args) {
    }
}
