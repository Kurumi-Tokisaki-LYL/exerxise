/**
 * Created by Kurumi Tokisaki on 2021-2-27.
 */
public class TwoNodeSort {
    //region Description  alt+shift+z
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode newnode = l1.val < l2.val ? l1 : l2;
        newnode.next = mergeTwoLists(newnode.next, l1.val >= l2.val ? l1 : l2);
        return newnode;
    }
    //endregion

    public static void main(String[] args) {
        TwoNodeSort twoNodeSort = new TwoNodeSort();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(3, listNode);
        ListNode listNode2 = new ListNode(5, listNode1);

        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode listNode5 = new ListNode(6, listNode4);
        ListNode printnode = twoNodeSort.mergeTwoLists(listNode2, listNode5);
        while (printnode != null) {
            System.out.println(printnode.val);
            printnode = printnode.next;
        }
    }
}