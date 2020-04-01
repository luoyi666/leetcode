//package linkedlist;
//
//public class RemoveNthFromEnd {
//    static int count = 1;
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        int len = 0;
//        ListNode tempNode = head;
//        while(tempNode != null){
//            len++;
//            tempNode = tempNode.next;
//        }
//        tempNode = newHead;
//        for (int i = 0; i < len-n; i++) {
//            tempNode = tempNode.next;
//        }
//        tempNode.next = tempNode.next.next;
//       return newHead.next;
//    }
//
//    public static ListNode removeNthFromEnd2(ListNode head, int n) {
//        ListNode fast = head;
//        while(n != 0){
//            n--;
//            fast = fast.next;
//        }
//        if(fast == null){
//            return head.next;
//        }
//        ListNode slow = head;
//        while(fast != null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = slow.next.next;
//        return head;
//    }
//
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        ListNode resultNode = removeNthFromEnd2(n1,4);
//        System.out.println(resultNode.val);
//    }
//}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}