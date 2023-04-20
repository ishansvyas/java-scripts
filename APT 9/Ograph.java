import java.util.*;

public class Ograph {
    
    public int[] components(String[] data) {
        HashMap<Integer, HashSet<Integer>> edges = new HashMap<>();
        ArrayList<Integer> allList = new ArrayList<Integer>();
        for (int i=0;i<data.length;i++) {
            edges.put(i, new HashSet<>());
            allList.add(i);
            String[] nums = data[i].split(" ");
            for (String s:nums) {
                edges.get(i).add(Integer.parseInt(s));
            }            
        }
        HashSet<HashSet<Integer>> connectedComps = new HashSet<>();
        for (Integer val:allList) {
            HashSet<Integer> singleComp = bfs(val, edges);
            connectedComps.add(singleComp);
        }
        int[] finalRet = new int[connectedComps.size()];
        int iterator = 0;
        for (HashSet<Integer> ts : connectedComps) {
            finalRet[iterator] = ts.size();
            iterator++;
        }
        Arrays.sort(finalRet);
        return finalRet;
    }
    public HashSet<Integer> bfs(Integer val, HashMap<Integer, HashSet<Integer>> edges) {
        HashSet<Integer> ret = new HashSet<>();
        HashSet<Integer> alreadyVisited = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(val);
        while (!pq.isEmpty()) {
            Integer popped = pq.poll();
            alreadyVisited.add(popped);
            ret.add(popped);
            for (Integer k: edges.get(popped)) {
                if (!alreadyVisited.contains(k)) {
                    pq.add(k);
                }
            }
        }
        return ret;
    }
}
