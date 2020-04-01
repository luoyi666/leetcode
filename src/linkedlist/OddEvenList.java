package linkedlist;

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode tempEven = even;
        while(odd.next != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = tempEven;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        oddEvenList(n1);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}