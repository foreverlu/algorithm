package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/22  下午1:38
 */
public class Solution {
//[2,4,9]
//[5,6,4,9]
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2;
        ListNode l11 = new ListNode();
        l11.val = 4;
        l1.next = l11;
        ListNode l111 = new ListNode();
        l111.val = 9;
        l11.next = l111;

        ListNode l2 = new ListNode();
        l2.val = 5;
        ListNode l22 = new ListNode();
        l22.val = 6;
        l2.next = l22;
        ListNode l222 = new ListNode();
        l222.val = 4;
        l22.next = l222;
        ListNode l2222 = new ListNode();
        l2222.val = 9;
        l222.next = l2222;


        addTwoNumbers(l1,l2);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int y = 0;
        int s = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode d = new ListNode();
        ListNode r = d;
        ListNode t = null;
        while(p1!=null || p2!=null){
            d.next =new ListNode();

            int v1 = 0;
            int v2 = 0;
            if(p1!=null){
                v1 = p1.val;
            }
            if(p2!=null){
                v2 = p2.val;
            }

            s = (v1+v2+y)%10;
            d.next =new ListNode();
            d.next.val = s;
            d = d.next;
            y = (v1+v2+y) /10;
            if(p1!=null)
            p1 = p1.next;
            if(p2!=null)
            p2 = p2.next;
        }

        if(y>0){
            p1 = t;
            ListNode a = new ListNode();
            a.val = y;
            p1.next = a;

        }


        return l1;
    }

}
