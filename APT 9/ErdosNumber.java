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
        
    }
    public void bfsErdos() {

    }
}
