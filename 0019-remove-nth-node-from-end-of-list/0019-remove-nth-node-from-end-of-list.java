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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=1;
        while(temp.next != null){
            count++;
            temp=temp.next;
        }
        count = count-n;
        temp = head;
        if(count==0){
            head = head.next;
            return head;
        }
        while(count != 1){
            temp = temp.next;
            count--;
        }
        temp.next = temp.next.next;
        return head;
    }
}