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
    public ListNode deleteMiddle(ListNode head) {
        
        if (head.next == null){
            return head.next;
        }
        
        ListNode single_jump = head;
        ListNode double_jump = head.next;
        
        while (double_jump.next != null && double_jump.next.next != null){
            single_jump = single_jump.next;
            double_jump = double_jump.next.next;
        }
        
        single_jump.next = single_jump.next.next;
        
        return head;
    }
}