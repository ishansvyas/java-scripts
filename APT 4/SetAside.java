import java.util.*;
public class SetAside {
    public String common(String[] list) {
        
        /*
         * 1. for loop to cut each element into array of elements via .split(" ")
         * 2. create TreeSets for all? 
         * 3. use addAll() to find union??
         */
        TreeSet<String> commonSet = new TreeSet<>();
        TreeSet<String> thisElement = new TreeSet<>();

        for (int i=0;i<list.length;i++) {
            thisElement.clear();
            String[] elements = list[i].split(" ");
            for (String e : elements) {
                thisElement.add(e);
            }
            if (i==0) {
                commonSet.addAll(thisElement);
            }
            else {
                commonSet.retainAll(thisElement);
            }
        }
        StringBuilder ret = new StringBuilder();
        for (String c : commonSet) {
            if (ret.toString() == "") {
                ret.append(c);
            }
            else {
                ret.append(" ");
                ret.append(c);
            }
        }
        String ret2 = ret.toString();
        return ret2;
    }
}
