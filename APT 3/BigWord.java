import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i=0; i<sentences.length; i++) {
            String[] deconst = sentences[i].split(" ");
            for (String s : deconst) {
                String s2 = s.toLowerCase();
                wordCount.putIfAbsent(s2, 1);
                if (wordCount.containsKey(s2)) {
                    wordCount.put(s2,wordCount.get(s2) + 1);
                }
            }
        }
        int maxVal = Collections.max(wordCount.values());
        // find the max val and return
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (maxVal == entry.getValue()) {
                return entry.getKey();
            }
        } 
        return " ";
    }
}
