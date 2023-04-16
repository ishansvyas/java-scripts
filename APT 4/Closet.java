import java.util.*;
public class Closet {
    public String anywhere(String[] list) {
        // literally just a treeset
        Set<String> allWords = new TreeSet<>();
        StringBuilder ret = new StringBuilder();
        for (int i=0;i<list.length;i++) {
            for (String l : list[i].split(" ")) {
                allWords.add(l);
            }
        }
        for (String t : allWords) {
            ret.append(t);
            ret.append(" ");
        }
        ret.deleteCharAt(ret.length()-1);
        String ret2 = new String();
        ret2 = ret.toString();
        return ret2;
    }   
}
