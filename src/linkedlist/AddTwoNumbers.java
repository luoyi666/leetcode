//package linkedlist;
//
//import java.util.Stack;
//
//public class AddTwoNumbers {
////    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        if(l1 == null && l2 != null){
////            return l2;
////        }
////        if(l1 != null && l2 == null){
////            return l1;
////        }
////        if(l1 == null && l2 == null){
////            return l1;
////        }
////        ListNode head1 = reverseList1(l1);
////        ListNode head2 = reverseList1(l2);
////        ListNode pre = null;
////        ListNode tempHead = head1;
////        int sum = 0;
////        boolean flag = false;
////        while(head1 != null && head2 != null){
////            sum = (flag == true) ? head1.val + head2.val + 1 : head1.val + head2.val;
////            if(sum >= 10){
////                head1.val = sum - 10;
////                flag = true;
////            }else {
////                head1.val = sum;
////                flag = false;
////            }
////            if(head1.next == null){
////                pre = head1;
////            }
////            head1 = head1.next;
////            head2 = head2.next;
////        }
////
////        if(pre != null){
////            pre.next = head2;
////        }
////        if(head1 == null && head2 == null){
////            ListNode resultNode = reverseList1(tempHead);
////            return resultNode;
////        }
////        while(head1 != null){
////            head1.val = (flag == true) ? head1.val + 1 : head1.val;
////            if(head1.val >= 10){
////                head1.val = head1.val - 10;
////                flag = true;
////            }else {
////                flag = false;
////            }
////            head1 = head1.next;
////        }
////        while(head2 != null){
////            head2.val = (flag == true) ? head2.val + 1 : head2.val;
////            if(head2.val >= 10){
////                head2.val = head2.val - 10;
////                flag = true;
////            }else {
////                flag = false;
////            }
////            head2 = head2.next;
////        }
////        if(flag){
////            ListNode lastNode = new ListNode(1);
////            pre.next = lastNode;
////        }
////        ListNode resultNode = reverseList1(tempHead);
////        return resultNode;
////    }
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        Stack<Integer> stack1 = new Stack<Integer>();
//        Stack<Integer> stack2 = new Stack<Integer>();
//        ListNode node1 = l1;
//        while(node1 != null){
//            stack1.push(node1.val);
//            node1 = node1.next;
//        }
//        ListNode node2 = l2;
//        while(node2 != null){
//            stack2.push(node2.val);
//            node2 = node2.next;
//        }
//        int flag = 0;
//        ListNode newHead = new ListNode(-1);
//        while(!stack1.isEmpty() || !stack2.isEmpty() || flag != 0){
//           int sum = 0;
//           if(!stack1.isEmpty()){
//               sum += stack1.pop();
//           }
//           if(!stack2.isEmpty()){
//               sum += stack2.pop();
//           }
//           sum += flag;
//           ListNode tempNode = new ListNode(sum % 10);
//           tempNode.next = newHead.next;
//           newHead.next = tempNode;
//           flag = sum / 10;
//        }
//        return newHead.next;
//    }
//
////    public static ListNode reverseList1(ListNode head) {
////        if (head == null || head.next == null) {
////            return head;
////        }
////        ListNode newHead = new ListNode(-1);
////        ListNode currentNode = head;
////        ListNode nextNode = null;
////        while (currentNode != null) {
////            nextNode = currentNode.next;
////            currentNode.next = newHead.next;
////            newHead.next = currentNode;
////            currentNode = nextNode;
////
////        }
////        return newHead.next;
////    }
//
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(5);
//        ListNode n2 = new ListNode(5);
//        ListNode n3 = new ListNode(5);
//        ListNode n4 = new ListNode(5);
//        n1.next = n2;
//        n3.next = n4;
//        ListNode resultNode = addTwoNumbers(n1,n3);
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