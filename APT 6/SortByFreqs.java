import java.util.*;
import java.lang.Math;

public class SortByFreqs {
    Map<String, Integer> frequencies = new HashMap<>();
    public String[] sort(String[] data) {
        this.frequencies = fillMap(data);
        String[] cleanData = removeRepeats(data);
        Arrays.sort(cleanData, new SortByFreqsComp());
        return cleanData;
    }
    private class SortByFreqsComp implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (frequencies.get(b) - frequencies.get(a) != 0) {
                return frequencies.get(b) - frequencies.get(a);
            } 
            int minLength = Math.min(a.length(),b.length());
            for (int i=0;i<minLength;i++) {
                if ((int)a.charAt(i) - (int)b.charAt(i) != 0) {
                    return (int)a.charAt(i) - (int)b.charAt(i);
                }
            }
            return a.compareTo(b);
        }
    }
    private String[] removeRepeats(String[] data) {
        TreeSet<String> noRepeats = new TreeSet<>();
        for (int i=0;i<data.length;i++) {
            noRepeats.add(data[i]);
        }
        String[] ret = new String[noRepeats.size()];
        int counter = 0;
        for (String e : noRepeats) {
            ret[counter] = e;
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
}
