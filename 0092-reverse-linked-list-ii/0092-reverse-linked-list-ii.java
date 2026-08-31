/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int Left, int Right) {
        if(Left == Right) return head;
        ListNode temp = head;
        ListNode left = head;
        ListNode right = head;
        while(left != null && Left != 1){left = left.next; Left--;}
        while(right != null && Right != 1){right = right.next; Right--;}
        if(left==null || right==null){
            left = head;
            right = head;
            while(right.next != null) right = right.next;
        }
        if(head == null || head.next == null) return head;
        ListNode A = left;
        ListNode B = A.next;
        ListNode C = B.next;
        if(temp == left){
            temp = null;
        }else {
            while (temp.next != left){
                temp = temp.next;
            }
        }
        right = right.next;
        if (C == null && B == right){
            B.next = A;
            A.next = temp;
            if(A == head){
                head = B;
                return head;
            }
        }
        while (C != right){
            B.next = A;
            A = B;
            B = C;
            C = C.next;
        }
        B.next = A;
        if (temp != null){temp.next = B;}
        else {
            head = B;
        }
        left.next = right;
        return head;
    }
}