import java.util.*;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        //create an arrayList for all words that pass the minimum length
        List<String> passes = new ArrayList<String>();

        // create hashset to catch all duplicates
        Set<String> uniqueWords = new HashSet<>();

        //iterate through each word in the inputted list and set String 'word' as equal to it
        for (int i=0; i<list.length; i++) {
            String word = list[i];

            //only count words that aren't repeated and more than the minimum length
            if (!uniqueWords.contains(word) && word.length()>=minLength) {
                passes.add(word);
                uniqueWords.add(word);
            }
        }
        // create new array to return
        String[] returnable = new String[passes.size()];

        // read all elements of the arraylist into an array
        for (int j=0; j<passes.size(); j++) {
            returnable[j] = passes.get(j);
        }
        return returnable;
    }
}
