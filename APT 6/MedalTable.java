import java.util.*;
public class MedalTable {
    Map<String, Integer[]> medalTableMap = new HashMap<>();
    public String[] generate(String[] results) {
        Integer[] temp;
        String[] podiumFinish;
        for (int i=0;i<results.length;i++) {
            podiumFinish = results[i].split(" ");
            for (int j=0;j<podiumFinish.length;j++) {
                //might remove the +1 below
                medalTableMap.putIfAbsent(podiumFinish[j], new Integer[3]);
                temp = medalTableMap.get(podiumFinish[j]);
                if (temp[j]==null) {temp[j]=0;}
                temp[j]++;
                // temp[3] += (int)Math.pow(10,2-j); //might delete later, but could be useful
                medalTableMap.put(podiumFinish[j],temp);
            }
        }
        ArrayList<String> retInList = new ArrayList<>();
        StringBuilder fromMapToList = new StringBuilder();
        int numMedals;
        for (Map.Entry<String,Integer[]> entry : medalTableMap.entrySet()) {
            fromMapToList.append(entry.getKey());
            for (int l=0;l<entry.getValue().length;l++) {
                if (entry.getValue()[l]==null) {
                    numMedals = 0;
                }
                else {numMedals=entry.getValue()[l];}
                fromMapToList.append(" " + numMedals);
            }
            retInList.add(fromMapToList.toString());
            fromMapToList.setLength(0);
        } 
        String[] ret = retInList.toArray(new String[retInList.size()]);
        Arrays.sort(ret,new MedalTableComp());
        return ret;
    }
    private class MedalTableComp implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String countryCodeA = a.substring(0,3);
            String countryCodeB = b.substring(0,3);
            Integer[] aMedals = medalTableMap.get(countryCodeA);
            Integer[] bMedals = medalTableMap.get(countryCodeB);
            for (int i=0;i<aMedals.length;i++) {
                if (aMedals[i] ==null) {aMedals[i]=0;}
                if (bMedals[i] ==null) {bMedals[i]=0;}
            }
            if (aMedals[0]-bMedals[0]!=0) {
                return bMedals[0]-aMedals[0];
            }
            if (aMedals[1]-bMedals[1]!=0) {
                return bMedals[1]-aMedals[1];
            }
            if (aMedals[2]-bMedals[2]!=0) {
                return bMedals[2]-aMedals[2];
            }
            return countryCodeA.compareTo(countryCodeB);
        }
    }
}
