package leetcode;


/**
 * @author caoweiwei
 * @date 2021/10/20  上午11:22
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null){
           return l2;
       }
       if(l2==null){
           return l1;
       }

       ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
       while (l1!=null && l2 != null){
           if(l1.val<l2.val){
              curr.next = l1;
              l1 = l1.next;
           }else {
               curr.next = l2;
               l2 = l2.next;
           }
           curr = curr.next;
       }
       if(l1!=null){
           curr.next = l1;
       }
       if(l2!=null){
           curr.next = l2;
       }
        return dummy.next;
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
