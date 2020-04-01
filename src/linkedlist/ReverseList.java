//package linkedlist;
//
//public class ReverseList {
//    public static ListNode reverseList(ListNode head) {
//        ListNode resultNode = null;
//        ListNode temp2;
//        ListNode temp = head;
//        int len = 0;
//        while(temp != null){
//            len++;
//            if(temp.next == null){
//                resultNode = temp;
//            }
//            temp = temp.next;
//        }
//        temp = head;
//        for (int i = len-2; i >= 0; i--) {
//            int count = i;
//            while(count != 0){
//                count--;
//                temp = temp.next;
//            }
//            temp = new ListNode(temp.val);
//            temp2 = resultNode;
//            while(true){
//                if(temp2.next == null){
//                    break;
//                }
//                temp2 = temp2.next;
//            }
//            temp2.next = temp;
//
//            temp = head;
//        }
//
//        return resultNode;
//    }
//    public static ListNode reverseList1(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode newHead = new ListNode(-1);
//        ListNode currentNode = head;
//        ListNode nextNode = null;
//        while(currentNode != null){
//            nextNode = currentNode.next;
//            currentNode.next = newHead.next;
//            newHead.next = currentNode;
//            currentNode = nextNode;
//
//        }
//        return newHead.next;
//    }
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        ListNode resultNode = reverseList1(n1);
//        while(true){
//            System.out.print(resultNode.val +"->");
//            if(resultNode .next == null){
//                break;
//            }
//            resultNode = resultNode.next;
//        }
//    }
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}