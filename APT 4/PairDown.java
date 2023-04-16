import java.util.*;
public class PairDown {
    public int[] fold(int[] list) {

        /*
         * 1. create ArrayList to store ints
         * 2. for loop, iterating through 
         *      2a. if i is even, add to int sum
         *      2b. if i is odd, add sum+[i] to arraylist, then set sum to 0
         *      2c. if i=list.length-1 && i is even, add to list.
         * 3?. turn arraylist to array
         * 4. return array
         */
        List<Integer> folded = new ArrayList<>();
        int evenNum = 0;
        for (int i=0;i<list.length;i++) {
            if (i % 2 == 0 && i != list.length - 1) {
                evenNum = list[i];
            }
            else {
                folded.add(evenNum + list[i]);
                evenNum = 0;
            }
        }
        int[] ret = new int[folded.size()];
        for (int j=0;j<folded.size();j++) {
            ret[j] = folded.get(j);
        } 
        return ret;       
    }
}
