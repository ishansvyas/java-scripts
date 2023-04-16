public class ListSum {
    public int sum(ListNode list, int thresh) {
        int ret = 0;
        while (list != null && list.next != null) {
            if (list.info > thresh) {
                ret = ret + list.info;
            }
            list = list.next;
        }
        if (list != null && list.info > thresh) {
            ret = ret + list.info;
        }
        return ret;
    }
}