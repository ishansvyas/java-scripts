public class TxMsg {
    public String getMessage(String original) {       
        String[] s = original.split(" ");
        String returnable = "";
        for (int i = 0; i<s.length; i++) {
            if (!allVowels(s[i])) {
                returnable = returnable + truncate(s[i]);
            }
            else {
                returnable = returnable + s[i];
            }
            if ((i+1) < s.length) {
                returnable = returnable + " ";
            }
        }
        return returnable;
    }
    // returns t/f as to whether the character is a vowel or not
    public boolean isVowel(char c) {
        boolean ret = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            ret = true;
        }
        return ret;
    }
    // returns t/f as to whether the string contains all vowels or not
    public boolean allVowels(String s) {
        for (int i = 0; i<s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    // truncates the string along the rules given by the APT instructions, ... 
    // ...assuming the word is NOT all vowels 
    public String truncate(String s) {
        char[] a = s.toCharArray();
        String ret = "";
        for (int i = 0; i<a.length; i++) {
            if (!isVowel(a[i]) && (i == 0 || isVowel(a[i-1]))) {
                ret = ret + a[i];
            }
        }
        return ret;
    }
}