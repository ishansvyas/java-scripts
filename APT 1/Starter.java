import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        char beginning_letter = first.charAt(0);
        Set<String> uniqueWords = new HashSet<>();

        for (int i=0; i<words.length; i++) {
            String word = words[i];
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                if (word.charAt(0) == beginning_letter) {
                    count += 1;
                }
            }
        }
        // Print results
        return count;
    }
}
