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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null) return head;
        ListNode temp=head;
        int count=1;
        while(temp.next != null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        for(int i=0;i<k;i++){
            temp=head;
            while(temp.next.next != null){
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
        return head;
    }
}