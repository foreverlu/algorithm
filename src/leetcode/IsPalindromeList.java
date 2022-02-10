package leetcode;

import leetcode.MergeTwoLists.ListNode;
import org.w3c.dom.NodeList;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午1:37
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class IsPalindromeList {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast!=null){
            slow = slow.next;
        }
        slow = revert(slow);
        ListNode p = head;
        while (slow!=null){
            if(p.val!=slow.val){
                return false;
            }
            p = p.next;
            slow = slow.next;
        }

        return true;
    }

    public static ListNode revert(ListNode head){
        ListNode p = null;
        while (head!=null){
            ListNode t = head.next;
            head.next = p;
            p = head;
            head = t;
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
