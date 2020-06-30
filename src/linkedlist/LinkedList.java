package linkedlist;

/**
 * 单向链表
 *
 * @param <T>
 */
public class LinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    public LinkedList() {

    }

    class Node<T> {
        T val;
        Node next;

        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(T val) {
        linkedLast(val);
    }

    public void linkedLast(T val) {
        final Node t = tail;
        final Node newNode = new Node(val, null);
        tail = newNode;
        if (t == null) {
            head = newNode;
        } else {
            t.next = newNode;
        }
    }

    public void printList() {
        Node next = head;
        while (next != null) {
            System.out.print(next.val);
            System.out.println(",");
            next = next.next;
        }
    }

    public void reverse() {
        if (head == null || head.next==null) return;

        Node dummy = new Node(-1,head);
        Node pre = head;
        Node pcu = head.next;
        while (pcu!=null){
           pre.next=pcu.next;
           pcu.next=dummy.next;
           dummy.next=pcu;
           pcu = pre.next;

        }



    }

}
