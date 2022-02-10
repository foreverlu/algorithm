package leetcode;

/**
 * @author caoweiwei
 * @date 2021/11/2  上午10:13 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class MergeKLists {


    public ListNode mergeKLists(ListNode[] lists) {
        if (null == lists) {
            return null;
        }
        if (lists.length < 2) {
            return lists[0];
        }
        int k = lists.length;
        ListNode res = lists[0];
        for (int i = 1; i < k; i++) {
            ListNode node = lists[i];

            res = merge2Lists(res, node);
        }
        return res;
    }

    //合并两个有序列表
    private ListNode merge2Lists(ListNode res, ListNode node) {
        ListNode p = new ListNode();
        ListNode d = p;

        ListNode p1 = res;
        ListNode p2 = node;

        while (p1 != null && p2 != null) {
            if (p1.val >= p2.val) {
                d.next = p2;
                p2 = p2.next;
            } else {
                d.next = p1;
                p1 = p1.next;
            }
            d = d.next;
        }
        d.next = p1==null?p2:p1;

        return p.next;
    }

}
