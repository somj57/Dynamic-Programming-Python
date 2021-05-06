class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3=root=ListNode(0)
        
        while(l1 or l2):
            
            if(l1 and l2):
                if(l1.val<=l2.val):
                    l3.next=ListNode(l1.val)
                    l3=l3.next
                    l1=l1.next
                
                else:
                    l3.next=ListNode(l2.val)
                    l3=l3.next
                    l2=l2.next
                    
            elif(l1):
                l3.next=ListNode(l1.val)
                l3=l3.next
                l1=l1.next
                
            elif(l2):
                l3.next=ListNode(l2.val)
                l3=l3.next
                l2=l2.next
        
        return root.next