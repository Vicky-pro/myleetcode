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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        for(int i=1;second != null && i<k;i++){
            second = second.next;
        }
        ListNode temp=second;
        while(second.next != null){
            second = second.next;
            first = first.next;
        }
        int num = first.val;
        first.val = temp.val;
        temp.val = num;
        return head;
    }
}