import java.util.*;

public class FriendScore {
    public int highestScore(String[] friends) {
        int max = 0;
        // hashmap maps each person with whom they are friends with
        HashMap<Integer, HashSet<Integer>> friendsMap = new HashMap<>();
        for (int i=0;i<friends.length;i++) {
            for (int j=i+1;j<friends.length;j++) {
                friendsMap.putIfAbsent(i, new HashSet<Integer>());
                if (friends[i].charAt(j) == 'Y') {
                    friendsMap.get(i).add(j);
                    friendsMap.putIfAbsent(j, new HashSet<Integer>());
                    friendsMap.get(j).add(i);
                }
            }
        }
        if (friendsMap.isEmpty()) return 0;
        // by this point, the map should be full with each person, ...
        // ..and their friend. 
        int numFriends;
        HashSet<Integer> alreadyCounted = new HashSet<>();
        for (int i=0;i<friends.length;i++) {
            numFriends=0;
            alreadyCounted.clear();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (Integer j:friendsMap.get(i)) {
                pq.add(j);
                alreadyCounted.add(j);
                numFriends++;
            }
            while (!pq.isEmpty()) {
                int k = pq.poll();
                if (friendsMap.get(k) != null) {
                    for (Integer l:friendsMap.get(k)) {
                        if (!alreadyCounted.contains(l)) {
                            alreadyCounted.add(l);
                            numFriends++;
                        } 
                    }
                }
            }
            if (numFriends > max) {
                max = numFriends;
            }
        }
        //return max-1 instead of max because algorithm counts the og themself
        return max-1;
    }
}