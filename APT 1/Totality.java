public class Totality {
    public int sum(int[] a, String stype) {
        int starter = 0;
        int rate = 1;
        int sum = 0;
        if (stype.equalsIgnoreCase("odd")) {
            starter = 1;
            rate = 2;
        }
        else if (stype.equalsIgnoreCase("even")) {
            starter = 0;
            rate = 2;
        }
        else {
            starter = 0;
            rate = 1;
        }
        for (int i = starter; i<a.length; i+=rate) {
            sum += a[i];
        }
        return sum;
    }
}
