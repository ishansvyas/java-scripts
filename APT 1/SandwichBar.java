public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        /* available == array of available ingredients 
         *     - each entry has a single word 
         * orders == array of preffered sandwiches
         *      - multiple words per entry */
        
         // final_index is returned at the end. arr includes the aspects of the order
         //order_aval determines if that order index is what is returned
        String[] arr = null;
        boolean order_aval = false;

        for (int i=0; i<orders.length; i++) {
            //array of elements in the ith order
            arr = orders[i].split(" ");

            //iterating through each element of the ith order
            inner_loop:
            for (int j=0; j<arr.length; j++) {

                // checking if each element is in the array 'available'
                for (int k=0; k<available.length; k++) {
                    if (available[k].equalsIgnoreCase(arr[j])) {
                        order_aval = true;
                        break;}
                    else if (k == (available.length - 1)) {
                        order_aval = false;
                        break inner_loop;}
                    }
                }
            if (order_aval) {
                return i;}
            arr = null;
            }
    return -1;
    }
}
