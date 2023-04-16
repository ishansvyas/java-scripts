import java.util.*;
public class SortedFreqs {
    Map<String, Integer> frequencies = new HashMap<>();
    Set<String> allWords = new TreeSet<>();
    public int[] freqs(String[] data) {
        this.frequencies = fillMap(data);
        this.allWords = fillSet(data);
        int[] ret = new int[allWords.size()];
        int counter = 0;
        for (String e : allWords) {
            ret[counter] = frequencies.get(e);
            counter++;
        }
        return ret;
    }
    private Map<String, Integer> fillMap(String[] data) {
        Map<String, Integer> sortedByFreq = new HashMap<>();
        for (int i=0; i<data.length;i++) {
            sortedByFreq.putIfAbsent(data[i], 0);
            sortedByFreq.put(data[i],sortedByFreq.get(data[i])+1);
        }
        return sortedByFreq;
    }
    private Set<String> fillSet(String[] data) {
        TreeSet<String> noRepeats = new TreeSet<>();
        for (int i=0;i<data.length;i++) {
            noRepeats.add(data[i]);
        }
        return noRepeats;
    }
}
