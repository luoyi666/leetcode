//package linkedlist;
//
//public class mergeTwoLists {
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode newHead = new ListNode(-1);
//        ListNode temp1 = l1;
//        ListNode temp2 = l2;
//        ListNode nextNode = null;
//        ListNode newNextNode = newHead;
//        while(temp1 != null && temp2 != null){
//            if(temp1.val < temp2.val){
//                nextNode = temp1.next;
//                temp1.next = null;
//                newNextNode.next = temp1;
//                temp1 = nextNode;
//                newNextNode = newNextNode.next;
//            }else{
//                nextNode = temp2.next;
//                temp2.next = null;
//                newNextNode.next = temp2;
//                temp2 = nextNode;
//                newNextNode = newNextNode.next;
//            }
//        }
//        if (temp1 != null){
//            newNextNode.next = temp1;
//        }
//        if(temp2 != null){
//            newNextNode.next = temp2;
//        }
//        return newHead.next;
//    }
//    //递归版
//    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2){
//        if(l1 == null){
//            return l2;
//        }
//        if(l2 == null){
//            return l1;
//        }
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(4);
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(3);
//        ListNode n6 = new ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n4.next = n5;
//        n5.next = n6;
//        ListNode resultNode = mergeTwoLists1(n1,n4);
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
//    ListNode(int x) { val = x; }
// }