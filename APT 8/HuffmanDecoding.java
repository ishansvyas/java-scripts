import java.util.*;
public class HuffmanDecoding {
    //TEST
    /*
    public static void main(String[] args) {
        String a = "0000";
        String[] d = {"0", "11111111111111111111111111111111111111111111111111"};
        HuffmanDecoding h = new HuffmanDecoding();
        h.decode(a, d);
    }
     */
    //END TEST
    HashSet<String> allCodes; // prepopulated  
    String[] dict;
    StringBuilder finalWord = new StringBuilder();
    public String decode(String archive, String[] dictionary) {
        List<String> l = Arrays.asList(dictionary);
        allCodes = new HashSet<String>(l);
        dict = dictionary;
        readLetter(archive);
        String ret = finalWord.toString();
        return ret;
    }
    public String readLetter(String archive) {
        if (archive == null || archive.length() == 0) {
            return new String();
        }
        String s1 = readLetter(archive.substring(0, archive.length()-1));
        String s2 = archive.substring(archive.length()-1, archive.length());
        String s = s1.concat(s2);
        if (allCodes.contains(s)) {
            for (int i=1;i<dict.length+1;i++) {
                if (dict[i-1].equalsIgnoreCase(s)) {
                    char c = (char)(i+64);
                    finalWord.append(c);
                    return new String();
                }
            }
        }
        return s;  
    }
}