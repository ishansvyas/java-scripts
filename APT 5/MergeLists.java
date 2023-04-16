public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
        boolean alternater = true;
        boolean isFirst = true;
        ListNode list = new ListNode(1);
        ListNode home = list;
        
        while (b != null) {
            if (alternater) {
                if (isFirst) {
                    list.info = a.info;
                    a = a.next;
                    isFirst = false;
                    if (list.next != null) {
                        list = list.next;
                    }
                }
                else {
                    list.next = new ListNode(a.info);
                    a = a.next;
                    if (list.next != null) {
                        list = list.next;
                    }
                }
                alternater = false;
            }
            else {
                list.next = new ListNode(b.info);
                b = b.next;
                if (list.next != null) {
                    list = list.next;
                }
                alternater = true;
            }
        }
        return home;
    }
}
