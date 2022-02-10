package leetcode;

/**
 * @author caoweiwei
 * @date 2021/11/10  上午9:54 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pp = dummy;
        ListNode p = head;

        while (p != null && p.next!=null) {
            ListNode t = p.next;
            p.next = p.next.next;
            pp.next = t;
            pp.next.next = p;
            pp = p;
            p = p.next;

        }

        return dummy.next;
    }
}
