import java.util.*;
public class LevelCount {
    public int count(TreeNode t, int level) {
        ArrayList<Integer> countedArray = allLengths(t);
        int countTarget = Collections.frequency(countedArray, level);
        return countTarget;
    }
    public ArrayList<Integer> allLengths(TreeNode tree) {
        if (tree == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ret = new ArrayList<>();
        ret.addAll(allLengths(tree.left));
        ret.addAll(allLengths(tree.right));
        if (ret.size() == 0) {
            ret.add(0);
            return ret;
        }
        else {
            for (int i=0;i<ret.size();i++) {
                ret.set(i, ret.get(i)+1);
            }
            ret.add(0);
            return ret;
        }
    }
}
