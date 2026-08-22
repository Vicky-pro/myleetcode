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
        ListNode temp = head;
        while (temp.next.next != null){
            temp=temp.next;
        }
        ListNode rHead = temp.next;
        temp.next.next = temp;
        while (head.next != null){
            temp = head;
            if(head.next.next == head){
                head.next = null;
                head = rHead;
                return head;
            }
            while (temp.next.next.next != temp.next){
                temp = temp.next;
            }
            temp.next.next = temp;
        }
        return rHead;
    }
}