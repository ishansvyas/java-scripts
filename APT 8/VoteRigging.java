public class VoteRigging {
    int votesNeeded = 0;
    public static void main(String[] args) {
        int[] votes = {5, 10, 7, 3, 8};
        VoteRigging v = new VoteRigging();
        System.out.println(v.minimumVotes(votes));
    }
    public int minimumVotes(int[] votes) {
        int maxIndex = findMaxIndex(votes);
        while (maxIndex != 0) {
            votes[maxIndex] = votes[maxIndex]-1;
            votes[0]++;
            votesNeeded++;
            maxIndex = findMaxIndex(votes);
        }
        return votesNeeded;
    }   
    public int findMaxIndex(int[] arr) {
        int max = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >= arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
