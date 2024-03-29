package leetcode;

import java.util.List;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午2:10
 * 给定一个链表，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 *  
 *
 * 进阶：
 *
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnwzei/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode p = head.next;
        ListNode pp = head.next.next;
        while (pp!=null && pp.next!=null){
            if(p.equals(pp)){
                return true;
            }
            p=p.next;
            pp = pp.next.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        if(head.next == head){
            return true;
        }

        ListNode t = head.next;
        head.next = head;

        head = t;
        return hasCycle(head);
    }
}
