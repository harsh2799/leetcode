# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head.next:
            return head.next
        
        single_node_jump = head
        double_node_jump = head.next
        
        while double_node_jump.next and double_node_jump.next.next:
            single_node_jump = single_node_jump.next
            double_node_jump = double_node_jump.next.next
            
        else:
            single_node_jump.next = single_node_jump.next.next
        
        return head