import java.util.*;
public class AlphaLength {
    public ListNode create(String[] words) {
        Set<String> uniqueWords = new TreeSet<>();
        for (String w : words) {
            uniqueWords.add(w);
        }
        // how do program it so that 1 is not the start?
        boolean tf = true;
        ListNode list = new ListNode(1);
        ListNode home = list;
        for (String u : uniqueWords) {
            if (tf) {
                list.info = u.length();
                tf = false;
            }
            else {
                list.next = new ListNode(u.length());
                list = list.next;
            }
        }
        return home;
    }
}
