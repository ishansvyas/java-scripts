public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        
        int max_occurrence = 0;
        int max_length = 0;
        String most_nuc = "";
        char char_nuc = nuc.charAt(0);

        for (int i = 0; i<strands.length; i++) {
            int count = 0;
            for (int j = 0; j<strands[i].length(); j++) {
                if (strands[i].charAt(j) == char_nuc) {
                    count++;
                }
            }
            if (count > max_occurrence) {
                most_nuc = strands[i];
                max_length = strands[i].length();
                max_occurrence = count;
            }
            else if (count == max_occurrence && count != 0) {
                if (strands[i].length() > max_length) {
                    most_nuc = strands[i];
                }
            }
        }
        return most_nuc;
    }
}
