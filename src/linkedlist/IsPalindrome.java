//package linkedlist;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Stack;
//
//public class IsPalindrome {
//    public static boolean isPalindrome(ListNode head) {
//        if(head == null ||head.next == null){
//            return true;
//        }
//        int len = 0;
//        ListNode temp1 = head;
//        while (temp1 != null){
//            len++;
//            temp1 = temp1.next;
//        }
//        int midLen = len % 2 == 1 ? (len / 2 + 1) : (len / 2);
//        temp1 = head;
//        ListNode temp2 = head;
//        for (int i = 0; i < midLen; i++) {
//            temp2 = temp2.next;
//        }
//        LinkedList<Integer> q1 = new LinkedList<Integer>();
//        Stack<Integer> q2 = new Stack<Integer>();
//        while(temp2 != null){
//            q1.add(temp1.val);
//            q2.push(temp2.val);
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//        int value1 = 0;
//        int vaule2 = 0;
//        while (!q2.isEmpty() && q1.size() > 0){
//            value1 = q1.pop();
//            vaule2 = q2.pop();
//            if(value1 != vaule2){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(2);
//        ListNode n4 = new ListNode(1);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        System.out.println(isPalindrome(n1));
//    }
//}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}