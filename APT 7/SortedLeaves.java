import java.util.*;
public class SortedLeaves {
    public static void main(String[] args) {
        SortedLeaves n = new SortedLeaves();
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(73);
        t.left.left = new TreeNode(68);
        t.left.right = new TreeNode(85);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(75);
        t.right.right = new TreeNode(69);
        n.values(t);
    }
    public String[] values(TreeNode tree) {
        TreeSet<Integer> leafValues = findLeaves(tree);
        String[] ret = new String[leafValues.size()];
        String str;
        int iterator = 0;
        for (Integer i:leafValues) {
            str = Character.toString((char)(i + '\0'));
            ret[iterator] = str;
            iterator++;
        }
        return ret;
    }
    public TreeSet<Integer> findLeaves(TreeNode tree) {
        if (tree == null) {
            return new TreeSet<Integer>();
        }
        else if (tree.left == null && tree.right == null) {
            TreeSet<Integer> toRet = new TreeSet<>();
            toRet.add(tree.info);
            return toRet;
        }
        else {
            TreeSet<Integer> toRet = new TreeSet<>();
            toRet.addAll(findLeaves(tree.left));
            toRet.addAll(findLeaves(tree.right));
            return toRet;
        }
    }
}
