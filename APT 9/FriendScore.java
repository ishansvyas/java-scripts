import java.util.*;
public class FriendScore {
    public int highestScore(String[] friends) {
        // hashmap maps each person with whom they are friends with
        HashMap<Integer, HashSet<Integer>> friendsMap = new HashMap<>();
        for (int i=0;i<friends.length;i++) {
            for (int j=i+1;j<friends.length;j++) {
                if (friends[i].charAt(j) == 'Y') {
                    friendsMap.putIfAbsent(i, new HashSet<Integer>());
                    friendsMap.get(i).add(j);
                    friendsMap.putIfAbsent(j, new HashSet<Integer>());
                    friendsMap.get(j).add(i);
                }
            }
        }
        // by this point, the map should be full with each person, ...
        // ..and their friend. 
        return 0;
    }
}