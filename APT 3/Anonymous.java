import java.util.*;
// this code HELLA inefficient fs, how do I clean it up?
public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i=0; i<headlines.length; i++) {
            String lower = headlines[i].toLowerCase();
            char[] deconst = lower.toCharArray();
            for (int j=0; j<deconst.length;j++) {
                letterCount.putIfAbsent(deconst[j], 1);
                if (letterCount.containsKey(deconst[j])) {
                    letterCount.put(deconst[j],letterCount.get(deconst[j])+1);
                }
            }
        }
        boolean possible;
        Map<Character, Integer> messageCount = new HashMap<>();
        for (int k=0;k<messages.length;k++) {
            messageCount.clear();
            possible = true;
            String lower2 = messages[k].toLowerCase();
            char[] a = lower2.toCharArray();
            for (int l=0; l<a.length;l++) {
                messageCount.putIfAbsent(a[l], 1);
                if (messageCount.containsKey(a[l])) {
                    messageCount.put(a[l],messageCount.get(a[l])+1);
                }
            }
            for (Map.Entry<Character, Integer> entry : messageCount.entrySet()) {
                if (lower2 == null) {break;}
                    if (!letterCount.containsKey(entry.getKey())) {
                        possible = false;
                        break;
                    }
                    if (entry.getValue() > letterCount.get(entry.getKey()) && entry.getKey() != ' ') {
                        possible = false;
                        break;
                }
            }
            if (possible) {count++;}
        }
        return count;
    }
    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        String[] headlines = {"abc "};
        String[] messages = {"AaBbCc ", " aabbbcc ", " ", " FADE "};
        a.howMany(headlines, messages);
    }
}
