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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode temp2 = temp.next;
        ListNode prev = null;
        while(true){
            temp.next = temp2.next;
            temp2.next = temp;
            if(temp == head){
                head = temp2;
            }else{
                prev.next = temp2;
            }
            prev = temp;
            temp = temp.next;
            if(temp == null || temp.next == null) return head;
            temp2 = temp.next;
        }
    }
}