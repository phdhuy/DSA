import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {

    public static List<Integer> res = new ArrayList<>();

    public static List<Integer> rightSideView(TreeNode root) {
        if(root == null) {
            return res;
        }
        res.add(root.val);

        res = rightSideView(root.right);
        return res;
    }

    public static void main(String[] args) {

    }
}
