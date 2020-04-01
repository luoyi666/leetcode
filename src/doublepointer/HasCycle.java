package doublepointer;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else {
                fast = fast.next;
            }
        }
        return false;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}