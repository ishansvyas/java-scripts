import java.util.*;
public class ErdosNumber {
    TreeMap<String, Set<String>> myGraph;
    TreeMap<String, Integer> myDistance;

    public String[] calculateNumbers(String[] pubs) {
        makeGraph(pubs);
        ArrayList<String> list = new ArrayList<>();
        bfsErdos();
        for (String s : myGraph.keySet()) {
            if (myDistance.containsKey(s)) {
                s = s + " " + myDistance.get(s);
            }
            list.add(s);
        }
        return list.toArray(new String[0]);
    }
    public void makeGraph(String[] pubs) {
        myGraph = new TreeMap<>();
        for (String authors : pubs) {
            String[] authorAr = authors.split(" ");
            for (String a : authorAr) {
                myGraph.putIfAbsent(a, new HashSet<>());
                for (String b : authorAr) {
                    if (!a.equals(b)) {
                        myGraph.get(a).add(b);
                    }
                }
            }
        }
    }
    public void bfsErdos() {
        myDistance = new TreeMap<>();
        String start = "ERDOS";
        HashSet<String> visited = new HashSet<>();
        Queue<String> qu = new LinkedList<>();
        visited.add(start);
        qu.add(start);
        myDistance.put(start, 0);
        while (qu.size()>0) {
            String v = qu.remove();
            for (String adj : myGraph.get(v)) {
                if (!visited.contains(adj)) {
                    visited.add(adj);
                    qu.add(adj);
                    myDistance.put(adj, myDistance.get(v) + 1);
                }
            }
        }

    }
}
