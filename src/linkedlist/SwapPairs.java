//package linkedlist;
//
//public class SwapPairs {
//    public static ListNode swapPairs(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode preNode = newHead;
//        ListNode curNode = head;
//        ListNode nextNode = head.next;
//        while(curNode != null && curNode.next != null){
//            preNode.next = nextNode;
//            curNode.next = nextNode.next;
//            nextNode.next = curNode;
//            preNode = curNode;
//            if (curNode != null){
//                curNode = curNode.next;
//            }
//            if(curNode != null){
//                nextNode = curNode.next;
//            }
//
//        }
//
//        return newHead.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        n1.next = n2;
//        ListNode resultNode = swapPairs(n1);
//        while(true){
//            System.out.print(resultNode.val +"->");
//            if(resultNode .next == null){
//                break;
//            }
//            resultNode = resultNode.next;
//        }
//    }
//}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}