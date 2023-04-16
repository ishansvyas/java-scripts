public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null) {
            return null;
        }
        ListNode goToLast = list;
        while (goToLast.next != null) {
            goToLast = goToLast.next;
        }
        ListNode ret = new ListNode(goToLast.info);
        ListNode home = ret;
        ret.next = list.next;
        while (list.next != null) {
            list = list.next;
            ret = ret.next;
            ret.next = list;
        }
        return home;
    }
    public static void main(String[] args) {
        ListLastFirst n = new ListLastFirst();
        ListNode w = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(n.move(w));
    }
}