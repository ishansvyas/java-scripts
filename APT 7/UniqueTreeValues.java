import java.util.*;
public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        TreeSet<Integer> allUniqueValues = findAllUnique(root);
        int[] vals = new int[allUniqueValues.size()];
        int iterator = 0;
        for (int i:allUniqueValues) {
            vals[iterator] = i;
            iterator++;
        }
        return vals;
    }
    public TreeSet<Integer> findAllUnique(TreeNode tree) {
        if (tree == null) return new TreeSet<Integer>();
        TreeSet<Integer> ret = new TreeSet<>();
        ret.addAll(findAllUnique(tree.left));
        ret.addAll(findAllUnique(tree.right));
        ret.add(tree.info);
        return ret;
    }
}
