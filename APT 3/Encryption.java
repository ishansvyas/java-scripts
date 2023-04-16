import java.util.*;
public class Encryption {
    public String encrypt(String message) {
        Map<Character, Character> cipher = new HashMap<>();
        char[] messageChar = message.toCharArray();
        int asciiCount = 97;
        StringBuilder ret = new StringBuilder();
        for (Character c : messageChar) {
            if (!cipher.containsKey(c)) {
                cipher.put(c,(char)asciiCount);
                ret.append((char)asciiCount);
                asciiCount++;
            }
            else {
                ret.append(cipher.get(c));
            }
        }        
        String retString = ret.toString();
        return retString;
    }
}
