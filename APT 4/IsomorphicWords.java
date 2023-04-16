import java.util.*;
public class IsomorphicWords {
    public int countPairs(String[] words) {
        /*
         * 1. each entry of words becomes a char[]
         * 2. each char[] is turned into a equivalent abc...
         * 3. each abc... is mapped with the number of times the abc... appears
         * 4. excluding values of 1, each value is put into 'n choose 2'
         * 5. return 'n choose 2'
         */
        Map<String, Integer> countAllIsomorphic = new HashMap<>();
        Map<Character, Character> emptyToIsomorphic = new HashMap<>();
        int asciiCount;
        StringBuilder toEncrpyt = new StringBuilder();
        int ret = 0;
        // for each word, create an "encryption"
        for (String w:words) {
            emptyToIsomorphic.clear();
            char[] messageChar = w.toCharArray();
            toEncrpyt.setLength(0);
            asciiCount = 97;
            for (char c:messageChar) {
                if (!emptyToIsomorphic.containsKey(c)) {
                    emptyToIsomorphic.put(c, (char)asciiCount);
                    toEncrpyt.append((char)asciiCount);
                    asciiCount++;
                }
                else {
                    toEncrpyt.append(emptyToIsomorphic.get(c));
                }
            }
            countAllIsomorphic.putIfAbsent(toEncrpyt.toString(), 0);
            countAllIsomorphic.put(toEncrpyt.toString(),countAllIsomorphic.get(toEncrpyt.toString())+1);
        }
        for (Map.Entry<String, Integer> entry : countAllIsomorphic.entrySet()) {
            if (entry.getValue() > 2) {
                // FIND THE DAMN ENTRY.getValue CHOOSE 2
                int choose2 = entry.getValue() * (entry.getValue()-1) / 2;
                ret = ret + choose2;
            }
            else if (entry.getValue() > 1) {
                ret = ret + 1;
            }
        }
        return ret;
    }
    /*
    //test interface
    public static void main(String[] args) {
        IsomorphicWords test = new IsomorphicWords();
        String[] words = {"jcd", "bsj", "ybo", "ahy", "xro", "bbx", "hgr", "llr", "eyt", "gbr", "xjr", "mar", "gla", "mzc", "xay", "zlh", "yys", "yzs", "ehc", "hgl", "cjh", "ytd", "elb", "yes", "rrh", "dlz", "oyg", "czd", "dbc", "dhj", "tyr", "xmj", "obt", "bdm", "ood", "yxs", "lam", "zlt", "dol", "cel" };
        System.out.print(test.countPairs(words));
    }
    */
}
