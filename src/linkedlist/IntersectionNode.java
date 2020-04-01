//package linkedlist;
//
//public class IntersectionNode {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null){
//            return null;
//        }
//        ListNode tempA = headA;
//        ListNode tempB = headB;
//        while (tempA != tempB){
//            tempA = (tempA == null) ? headB : tempA.next;
//            tempB = (tempB == null) ? headA : tempB.next;
//        }
//        return tempA;
//    }
//
//    public static void main(String[] args) {
//        ListNode nodeA1 = new ListNode(4);
//        ListNode nodeA2 = new ListNode(1);
//        ListNode nodeA3 = new ListNode(8);
//        ListNode nodeA4 = new ListNode(4);
//        ListNode nodeA5 = new ListNode(5);
//        System.out.println(nodeA2.val);
//        nodeA2 = nodeA1.next;
//        nodeA3 = nodeA2.next;;
//        nodeA4 = nodeA3.next;
//        nodeA5 = nodeA4.next;
//
//        ListNode nodeB1 = new ListNode(5);
//        ListNode nodeB2 = new ListNode(0);
//        ListNode nodeB3 = new ListNode(1);
//        ListNode nodeB4 = new ListNode(8);
//        ListNode nodeB5 = new ListNode(4);
//        ListNode nodeB6 = new ListNode(5);
//        nodeB2 = nodeB1.next;
//        nodeB3 = nodeB2.next;
//        nodeB4 = nodeB3.next;
//        nodeB5 = nodeB4.next;
//        nodeB6 = nodeB5.next;
//        IntersectionNode in = new IntersectionNode();
//        ListNode intersectionNode = in.getIntersectionNode(nodeA1, nodeB1);
//        System.out.println(intersectionNode.val);
//    }
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}