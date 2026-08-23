/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow=head;
        ListNode fast=head;
        if(slow.next==null || fast.next.next == null){
            return null;
        }
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                ListNode temp = head;
                while(true){
                    do{
                        if(temp == slow){
                            return temp;
                        }else{
                            slow = slow.next;
                        }
                    }while(slow != fast);
                    temp = temp.next;
                }
            }
        }
        return null;
    }
}