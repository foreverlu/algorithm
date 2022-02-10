package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/20  上午10:28 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class RevertList {


    public ListNode reverseList(ListNode head) {
        //新链表
        ListNode p = null;
        while(head != null){
            ListNode t = head.next;

            head.next = p;

            p = head;
            head = t;
        }

        return p;
    }


    public ListNode reverseList1(ListNode head) {
       ListNode p = null;

       while(head!=null){
           ListNode t = head.next;
           head.next = p;
           p = head;
           head =t;
       }


        return p;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
