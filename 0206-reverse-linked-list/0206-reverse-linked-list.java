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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){return head;}

        if(head.next.next == null){
            head.next.next = head;
            ListNode temp = head.next;
            head.next = null;
            return  temp;
        }

        ListNode A = head;
        ListNode B = A.next;
        ListNode C = B.next;
        A.next = null;
        while(true){
            if(C.next == null){
                C.next = B;
                B.next = A;
                return C;
            }
            B.next = A;
            A = B;
            B = C;
            C = C.next;
        }
    }
}