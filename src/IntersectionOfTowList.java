/**
 * @Author caoww
 * @Date 2025/8/29 08:58
 * 160. Intersection of Two Linked Lists (Easy)
 **/
public class IntersectionOfTowList {

    public static void main(String[] args) {

        ListNode h1 = new ListNode();
        h1.next = new ListNode();
        h1.next.next = new ListNode();
        h1.next.next.next = new ListNode();
        h1.next.next.next.next = new ListNode();
        ListNode h2 = new ListNode();
        h2.next = h1.next.next;
        System.out.println(find(h1,h2));
    }

    public static class ListNode{

        public ListNode next;

    }


    public  static ListNode find(ListNode h1 ,ListNode h2){

        ListNode l1 = h1;
        ListNode l2=h2;

        while(l1!=l2){
            l1 = (l1==null) ?h2:l1.next;
            l2 = (l2==null) ?h1:l2.next;
        }

        return l1;
    }
}
