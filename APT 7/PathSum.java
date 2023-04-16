import java.util.*;
public class PathSum {
    // it works!!
    public int hasPath(int target, TreeNode tree) {
        HashSet<Integer> allIntegers = allPossibilities(tree);
        if (allIntegers.contains(target)) {
            return 1;
        }
        return 0;
    }
    public HashSet<Integer> allPossibilities(TreeNode tree) {
        if (tree == null) {
            return new HashSet<>();
        }
        HashSet<Integer> ret = new HashSet<>();
        ret.addAll(allPossibilities(tree.left));
        ret.addAll(allPossibilities(tree.right));
        if (ret.size() == 0) {
            ret.add(tree.info);
            return ret;
        }
        else {
            HashSet<Integer> iterated = new HashSet<>();
            for (Integer i : ret) {
                iterated.add(i + tree.info);
            }
            return iterated;
        }
    }
}