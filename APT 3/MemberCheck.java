import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Set<String> culprits = new TreeSet<>();
        Set<String> visited1 = new HashSet<>();
        Set<String> visited2 = new HashSet<>();
        for (int i=0;i<club1.length;i++) {
            visited1.add(club1[i]);
        }
        for (int j=0;j<club2.length;j++) {
            visited2.add(club2[j]);
            if (visited1.contains(club2[j])) {
                culprits.add(club2[j]);
            }
        }
        for (int k=0;k<club3.length;k++) {
            if (visited1.contains(club3[k]) || visited2.contains(club3[k])) {
                culprits.add(club3[k]);
            }
        }
        String[] ret = culprits.toArray(new String[culprits.size()]);
        return ret;
    }
}
