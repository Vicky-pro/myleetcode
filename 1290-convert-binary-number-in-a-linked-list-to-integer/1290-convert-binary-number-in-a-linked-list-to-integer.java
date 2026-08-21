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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder builder = new StringBuilder();
        while(temp != null){
            builder.append(temp.val);
            temp = temp.next;
        }
        String binary = builder.toString();
        int ans = 0; int pow = 0;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i) == '1'){
                ans += Math.pow(2,pow);
            }
            pow++;
        }
        return ans;
    }
}