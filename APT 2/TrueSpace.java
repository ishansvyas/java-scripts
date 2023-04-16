public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // set counter as a long variable
        long returnable = 0L;

        // iterate through array
        for (int i=0; i<sizes.length; i++) {

            // if the file fits into one cluster, just add one cluster
            if (sizes[i] <= clusterSize) {

                // also if the file is non-zero
                if (sizes[i]!=0) {
                    returnable += clusterSize;
                }
            }
            else {
                if (sizes[i] % clusterSize != 0) {
                    int numClusters = 1 + (int) Math.floor(sizes[i] / clusterSize);
                    returnable += (numClusters * clusterSize);
                }
                else {
                    returnable += sizes[i];
                }
            }
        }
        return returnable;
    }
}