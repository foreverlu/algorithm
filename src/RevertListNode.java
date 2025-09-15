/**
 * @Author caoww
 * @Date 2025/8/29 09:08
 *
 *
 **/
public class RevertListNode {

    public static void main(String[] args) {
        ListNode h1 = new ListNode();
        h1.i = 1;
        h1.next = new ListNode();
        h1.next.i = 2;
        h1.next.next = new ListNode();
        h1.next.next.i = 3;
        h1.next.next.next = new ListNode();
        h1.next.next.next.i = 4;
        h1.next.next.next.next = new ListNode();
        h1.next.next.next.next.i = 5;

        ListNode t = revert(h1);
        while(t != null){
            System.out.println(t.i);
            t = t.next;
        }
    }

public static class ListNode{

    public ListNode next;
    public int i;

}


    public  static ListNode revert(ListNode head){

        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new  ListNode();
        while(head != null){
            ListNode temp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = temp;
        }

        return dummy.next;
    }

}