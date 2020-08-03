package com.LinkedList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int length_A = 0, length_B = 0, diff = 0;
//        ListNode tempA = headA, tempB = headB;
//        if(headA.next == null || headB.next == null) {
//            return null;
//        }
//        while(tempA.next != null) {
//            length_A++;
//            tempA = tempA.next;
//        }
//        while(tempB.next != null) {
//            length_B++;
//            tempB = tempB.next;
//        }
//        if (length_A > length_B) {
//            diff = length_A - length_B;
//            tempA = headA;
//            tempB = headB;
//        } else {
//            diff = length_B - length_A;
//            tempA = headB;
//            tempB = headA;
//        }
//        for( int i = 0; i < diff; i++) {
//            tempA = tempA.next;
//        }
//        while (tempA.next != null && tempB.next != null) {
//            if ( tempA == tempB){
//                return tempA.next;   
//            }
//            tempA = tempA.next;
//            tempB = tempB.next;
//        }
//        return null;
//    }
//}
