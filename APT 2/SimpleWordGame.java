import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        Set<String> gotCorrect = new HashSet<>();
        Set<String> dict = new HashSet<>();
        for (String d : dictionary) {
            dict.add(d);
        }
        for (String p : player) {
            gotCorrect.add(p);
        }
        // keeps the intersection of dict and gotCorrect in the set gotCorrect
        gotCorrect.retainAll(dict);

        // set is the set of words from the dictionary that the player remembered
        int ret = 0;
        for (String s : gotCorrect) {
            ret += s.length()*s.length();
        }
        // filler code
        return ret;
    }
}
