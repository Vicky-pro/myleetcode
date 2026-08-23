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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode Mid=getMid(head);
        firstHalf(head,Mid);
        ListNode left = sortList(head);
        ListNode right = sortList(Mid);

        return merge(left,right);
    }
    public static ListNode getMid(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow= head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public static void firstHalf(ListNode head,ListNode mid){
        if(head == null || head.next == null) return;
        ListNode temp = head;
        while (temp.next != mid) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static ListNode merge(ListNode left, ListNode right){
        if(left == null && right == null) return null;
        if(left == null) return right;
        if(right == null) return left;
        ListNode head = null;
        if(left.val < right.val) {
             head = left;
             left = left.next;
        }else {
             head = right;
             right = right.next;
        }
        ListNode temp = head;
        while (left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
            }else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left == null){
            temp.next = right;
        }else {
            temp.next = left;
        }
        return head;
    }
        /*Bubble sort will give TLE for last 2 test cases. We can't use insertion sort because we know next nodes not previous nodes in SLL; Lets do it through MergeSort
        
        ListNode first = head;
        ListNode second = head;
        while(first != null) first = first.next;
        while(first != head){
            second = head;
            while(second.next != first){
                if(second.val > second.next.val){
                    int temp = second.val;
                    second.val = second.next.val;
                    second.next.val = temp;
                }
                second = second.next;
            }
            first = second;
        }
        return head;*/
}