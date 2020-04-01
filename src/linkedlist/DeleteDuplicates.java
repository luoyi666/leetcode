//package linkedlist;
//
//public class DeleteDuplicates {
//    public static ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode preNode = head;
//        ListNode tempNode = head.next;
//        while(tempNode != null){
//            if(preNode.val == tempNode.val){
//                preNode.next = tempNode.next;
//                tempNode = tempNode.next;
//            }else{
//                preNode = preNode.next;
//                tempNode = tempNode.next;
//            }
//
//        }
//        return head;
//    }
//
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(2);
//        ListNode n4 = new ListNode(3);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        ListNode resultNode = deleteDuplicates(null);
//        System.out.println(resultNode);
//    }
//}
// class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}