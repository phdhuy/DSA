import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {
    public static List<Integer> leafArray(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) {
            return res;
        }
        
        if(root.left == null && root.right == null) {
            res.add(root.val);
            return res;
        }

        List<Integer> left = leafArray(root.left);
        List<Integer> right = leafArray(root.right);

        res.addAll(left);
        res.addAll(right);
        return res; 
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = leafArray(root1);
        List<Integer> leaf2 = leafArray(root2);
        
        return leaf1.equals(leaf2);
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(3);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(7);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(1);
        TreeNode n7 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8);

        n0.left = n1; n0.right = n6;
        n1.left = n2; n1.right = n3;
        n3.left = n4; n3.right = n5;
        n6.left = n7; n6.right = n8;
        
        System.out.println(leafSimilar(n0, n0));
    }
}
