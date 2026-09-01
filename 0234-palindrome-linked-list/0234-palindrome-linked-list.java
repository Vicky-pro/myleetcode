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
    public boolean isPalindrome(ListNode Head) {
        ListNode mid = getMid(Head);
        ListNode temp = mid;
        while (temp.next != null) temp = temp.next;
        Head = reversePali(Head, mid,temp);
        ListNode node = Head;
        ListNode node2 = temp;
        if(temp == mid){
            if(Head.val == temp.val) return true;
            else return false;
        } 
        while (node!= temp && node2 != mid.next){
            if (node.val != node2.val) {
                //Head = reversePali(Head,temp,mid);
                return false;
            }
            node2 = node2.next;
            node=node.next;
        }
        //Head = reversePali(Head,temp,mid);
        return true;
    }
    private ListNode getMid(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow= head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    private ListNode reversePali(ListNode head,ListNode left,ListNode right){
        ListNode temp = head;
        if(head == null || head.next == null) return head;
        if(head.next.next == null) {
            head.next.next = head;
            return head;
            }
        ListNode A = left;
        ListNode B = A.next;
        ListNode C = null;
        if(B.next!=null) C = B.next;
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