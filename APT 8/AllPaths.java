import java.util.*;

public class AllPaths {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right = new TreeNode(5);
        t.right.right = new TreeNode(6);
        AllPaths a = new AllPaths();
        a.paths(t);
    }
    public String[] paths(TreeNode t) {
        // arraylist of all paths
        ArrayList<StringBuilder> allPaths = getPathsArray(t);

        // ArrayList<StringBuilder> to String[] 
        String[] pathsArray = new String[allPaths.size()];
        int iterator = 0;
        for (StringBuilder path:allPaths) {
            pathsArray[iterator] = path.toString();
            iterator++;
        }

        // sort the array in ascending order, return
        Arrays.sort(pathsArray);
        return pathsArray;
    }

    // change to arraylist as opposed to hashset
    public ArrayList<StringBuilder> getPathsArray(TreeNode tree) {
        if (tree == null) {
            return new ArrayList<StringBuilder>();
        }
        else if (tree.left == null && tree.right == null) {
            ArrayList<StringBuilder> a = new ArrayList<>();
            StringBuilder s = new StringBuilder();
            s.append(Integer.toString((Integer)tree.info));
            a.add(s);
            return a;
        }
        else {
            ArrayList<StringBuilder> finalRet = new ArrayList<>();
            finalRet.addAll(getPathsArray(tree.left));
            finalRet.addAll(getPathsArray(tree.right));
            for (int i=0;i<finalRet.size();i++) {
                StringBuilder temp = finalRet.get(i);
                temp.insert(0,"->");
                temp.insert(0, Integer.toString((Integer)tree.info));
                finalRet.add(i, temp);
                finalRet.remove(i+1);
            }
            return finalRet;
        }

    }
    /*
    public HashSet<StringBuilder> getPaths(TreeNode tree) {
        if (tree == null) {
            return new HashSet<StringBuilder>();
        }
        else if (tree.left == null && tree.right == null) {
            HashSet<StringBuilder> retset = new HashSet<>();
            StringBuilder s = new StringBuilder();
            s.append(Integer.toString(tree.info));
            retset.add(s);
            return retset;
        }
        else {
            HashSet<StringBuilder> finalRet = new HashSet<>();
            finalRet.addAll(getPaths(tree.left));
            finalRet.addAll(getPaths(tree.right));
            // FOR LOOP THROWS ERROR
            // Instead, use an iterator:
            HashSet<StringBuilder> toRemove = new HashSet<>();
            for (Iterator<StringBuilder> i = finalRet.iterator(); i.hasNext();) {
                StringBuilder temp = i.next();
                toRemove.add(temp);
                temp.insert(0,"->");
                temp.insert(0, Integer.toString(tree.info));
                finalRet.add(temp);
            }
            for (StringBuilder s:toRemove) {
                finalRet.remove(s);
            }
            return finalRet;
        }
    }
        */
}
