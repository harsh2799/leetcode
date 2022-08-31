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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ln = head;
        while(ln != null && ln.next != null){
            if(ln.val == ln.next.val) {
                ln.next = ln.next.next;
            }
            else{
                ln = ln.next;
            }
        }
        return head;
    }
}