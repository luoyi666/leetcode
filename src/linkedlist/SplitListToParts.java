//package linkedlist;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//
//public class SplitListToParts {
//    public static ListNode[] splitListToParts(ListNode root, int k) {
//        int len = 0;
//        ListNode[] array = new ListNode[k];
//        if(root == null){
//            for (int i = 0; i < k; i++) {
//                array[i] = null;
//            }
//            return array;
//        }
//        ListNode temp = root;
//        ListNode nextNode = temp.next;
//        ListNode tempHead = temp;
//        while(temp != null){
//            len++;
//            temp = temp.next;
//        }
//        temp = root;
//        if(len <= k){
//            for (int i = 0; i < k; i++) {
//                if(i < len) {
//                    temp.next = null;
//                    array[i] = temp;
//                    temp = nextNode;
//                    if ( i != len -1){
//                        nextNode = nextNode.next;
//                    }
//                }else {
//                    array[i] = null;
//                }
//            }
//            return array;
//        }
//        int mod = len % k;
//        int size = len / k;
//        for (int i = 0; i < k; i++) {
//            if(i < mod){
//                for (int j = 0; j < size; j++) {
//                    temp = temp.next;
//                }
//                nextNode = temp.next;
//                temp.next = null;
//                array[i] = tempHead;
//                tempHead = nextNode;
//                temp = tempHead;
//            }else {
//                for (int j = 0; j < size-1; j++) {
//                    temp = temp.next;
//                }
//                nextNode = temp.next;
//                temp.next = null;
//                array[i] = tempHead;
//                tempHead = nextNode;
//                temp = tempHead;
//            }
//
//        }
//        return array;
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
//        System.out.println( Arrays.toString(splitListToParts(n1, 5)));
//    }
//}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}