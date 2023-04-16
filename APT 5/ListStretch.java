public class ListStretch {
    public ListNode stretch(ListNode list, int amount) {
        if (list == null) {
            return null;
        }
        ListNode ret = new ListNode(list.info);
        ListNode home = ret;
        int counter = 2;
        while (true) {
            if (amount - counter > 0) {
                ret.next = new ListNode(list.info);
                ret = ret.next;
                counter = counter + 1;
            }
            else {
                ret.next = new ListNode(list.info);
                ret = ret.next;
                if (list.next != null) {
                    list = list.next;
                    counter = 1;
                }
                else {
                    break;
                }
            }
        }
        if (counter == 1) {
            home = home.next;
        }
        return home;
    }
}
