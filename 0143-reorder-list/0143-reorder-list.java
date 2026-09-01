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
    public void reorderList(ListNode Head) {
        ListNode mid = getMid(Head);
        ListNode node=mid;
        if(node != null)while (node.next!=null) node = node.next;
        reversePali(Head,mid,node);
        ListNode dummyHead = getMid(Head);
        firstHalf(Head, dummyHead);
        Reorder(Head, dummyHead);
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
        ListNode A = left;
        if(left.next == null) return head;
        ListNode B = A.next;
        ListNode C=null;
        C = B.next;
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
    private void firstHalf(ListNode head,ListNode mid){
        if(head == null || head.next == null) return;
        ListNode temp = head;
        while (temp.next != mid) {
            temp = temp.next;
        }
        temp.next = null;

    }
    private ListNode Reorder(ListNode head,ListNode mid){
        if(head == null) return mid;
        if(mid == null) return head;
        if(head.next == null) {
            if(head != mid)head.next = mid;
            return head;
        }
        if(mid.next == null){
            mid.next=head.next;
            head.next = mid;
            return head;
        }

        ListNode A = head;
        ListNode C = mid;
        ListNode B = A.next;
        ListNode D = C.next;
        while (B != null && D != null){
            A.next = C;
            C.next = B;
            A=B;
            C=D;
            B=B.next;
            D=D.next;
        }
        A.next=C;

        return head;
    }
}