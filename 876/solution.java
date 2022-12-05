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
    public ListNode middleNode(ListNode head) {
        
        ListNode node1 = head;
        ListNode node2 = head;
        
        while(node1 != null && node1.next != null) {
            node1 = node1.next.next;
            node2 = node2.next;
        }
        
        
        return node2;
    }
}