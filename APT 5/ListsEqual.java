public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        boolean tf = true;
        int ret = 0;
        if ((a1 == null && a2 != null) || (a2 == null && a1 != null)) {
            tf = false;
        }
        while (tf && a1 != null && a2 != null) {
            if (a1.info != a2.info) {
                tf = false;
            }
            a1 = a1.next;
            a2 = a2.next;
            if ((a1 == null && a2 != null) || (a2 == null && a1 != null)) {
                tf = false;
            }
        }
        if (tf) {
            ret = 1;
        }
        return ret;
    }
}