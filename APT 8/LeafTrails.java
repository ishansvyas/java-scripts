import java.util.*;
public class LeafTrails {
    // use map to associate values with path.
    public String[] trails(TreeNode tree) {
        TreeMap<Integer, StringBuilder> allPathMap = findPaths(tree);
        Iterator <Integer> itor = allPathMap.keySet().iterator();
        ArrayList<String> allPathList = new ArrayList<>();
        while (itor.hasNext()) {
            int key =(int)itor.next();
            String s = allPathMap.get(key).toString();
            allPathList.add(s);
        }
        String[] ret = new String[allPathList.size()];
        for (int i=0;i<allPathList.size();i++) {
            ret[i] = allPathList.get(i);
        }
        return ret;
    }
    public TreeMap<Integer, StringBuilder> findPaths(TreeNode tree) {
        if (tree == null) {
            return new TreeMap<Integer, StringBuilder>();
        }
        if (tree.left == null && tree.right == null) {
            TreeMap<Integer, StringBuilder> path = new TreeMap<>();
            path.put(tree.info, new StringBuilder());
            return path;
        }
        TreeMap<Integer, StringBuilder> leftPaths = findPaths(tree.left);
        TreeMap<Integer, StringBuilder> rightPaths = findPaths(tree.right);
        Iterator <Integer> itLeft = leftPaths.keySet().iterator();
        Iterator <Integer> itRight = rightPaths.keySet().iterator();
        while (itLeft.hasNext()) {
            int key=(int)itLeft.next();
            StringBuilder n = leftPaths.get(key);
            n.insert(0, "0");
            leftPaths.put(key, n);
        }
        while (itRight.hasNext()) {
            int key=(int)itRight.next();
            StringBuilder n = rightPaths.get(key);
            n.insert(0, "1");
            rightPaths.put(key, n);
        }
        TreeMap<Integer, StringBuilder> ret = new TreeMap<>();
        ret.putAll(leftPaths);
        ret.putAll(rightPaths);
        return ret;
    }
}
