import java.util.*;
public class LengthSort {

    public String[] rearrange(String[] values) {
        Arrays.sort(values, new LengthSortComp());
        return values;
    }
    private class LengthSortComp implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            // return some number
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            for (int i=0;i<a.length();i++) {
                if ((int)a.charAt(i) - (int)b.charAt(i) != 0) {
                    return (int)a.charAt(i) - (int)b.charAt(i);
                }
            }
            return a.compareTo(b);
        }

    }
}
