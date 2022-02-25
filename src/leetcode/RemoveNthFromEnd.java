package leetcode;

/**
 * @author caoweiwei
 * @date 2022/2/16  上午9:32 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
//1,2
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int j = 0;
        ListNode secondP = head;
        ListNode second = head;
        ListNode first = head;
        while (first.next != null) {
            if (j >= n - 1) {
                secondP = second;
                second = second.next;
            }
            first = first.next;
            j++;
        }
        if (j == n - 1) {
            head = head.next;
        }else if(j>n-1){
            secondP.next = second.next;
        }
        return head;

    }
}
