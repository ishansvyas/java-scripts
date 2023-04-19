import java.util.*;
public class Circuits {
    public int howLong(String[] connects, String[] costs) {
        if (connects.length != costs.length || connects.length == 0) return 0;
        int max = 0;
        //HashSet<Integer> visited = new HashSet<>();
        HashMap<Integer, HashMap<Integer, Integer>> dirConnections = new HashMap<>();
        for (int i=0;i<connects.length;i++) {
            String[] connectArray = connects[i].split(" ");
            String[] costArray = costs[i].split(" ");
            dirConnections.put(i, new HashMap<>());
            for (int j=0;j<costArray.length;j++) {
                dirConnections.get(i).put(Integer.parseInt(connectArray[j]),Integer.parseInt(costArray[j]));
            }
        }
        
        return max;
    }
    public int longestLength(Integer start, HashMap<Integer, HashMap<Integer, Integer>> dirConnections) {
        if (!dirConnections.containsKey(start)) return 0;
        
        HashMap<Integer, Integer> distance = new HashMap<>();
        distance.put(start, 0);

        HashSet<Integer> visited = new HashSet<>();

        PriorityQueue<Integer> toExplore = new PriorityQueue<>();
        toExplore.add(start);
        while (toExplore.size()>0) {
            Integer current = toExplore.remove();
            visited.add(current);
            HashMap<Integer, Integer> connections = dirConnections.get(current);
            for (Map.Entry<Integer, Integer> entry : connections.entrySet()) {
                
            }
        }
        return 0;
    }
}
