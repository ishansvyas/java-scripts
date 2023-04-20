import java.util.*;
public class Circuits {
    // need help
    public static void main(String[] args) {
        String[] connects = {"", "2 3", "3 4 5", "4 6", "5 6", "7", "5 7", ""};
        String[] costs = {"", "30 50", "19 6 40", "12 10", "35 23", "8", "11 20", ""};
        Circuits l  = new Circuits();
        System.out.println(l.howLong(connects, costs));
    }
    public int howLong(String[] connects, String[] costs) {
        if (connects.length != costs.length || connects.length == 0) return 0;
        //HashSet<Integer> visited = new HashSet<>();
        HashMap<Integer, HashMap<Integer, Integer>> dirConnections = new HashMap<>();
        for (int i=0;i<connects.length;i++) {
            String[] connectArray = connects[i].split(" ");
            String[] costArray = costs[i].split(" ");
            dirConnections.put(i, new HashMap<>());
            for (int j=0;j<costArray.length;j++) {
                if (!costArray[j].equals("")){
                    dirConnections.get(i).put(Integer.parseInt(connectArray[j]),Integer.parseInt(costArray[j]));
                }
            }
        }
        int max = 0;
        int temp;
        for (int i=0;i<connects.length;i++) {
            temp = longestLength(i, dirConnections);
            if (temp > max) max = temp;
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
            for (Integer entry : connections.keySet()) {
                if (!visited.contains(entry)) toExplore.add(entry);
                if (!distance.containsKey(entry) || distance.get(entry) < distance.get(current) + connections.get(entry)) {
                    distance.put(entry, distance.get(current) + connections.get(entry));
                }
                
            }
        }
        int maxDist = 0;
        for (Integer distKey : distance.keySet()) {
            if (distance.get(distKey) > maxDist) maxDist = distance.get(distKey);
        }
        return maxDist;
    }
}
