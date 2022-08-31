class Solution:
    
    def hammingWeight(self, n: int) -> int:
        count = 0
        
        while n>0:
            n = (n&(n-1))
            count += 1;
            
        return count
        
"""
Long Method
""" 
#         t = 0
#         n = str(bin(n))
    
#         for i in n[2:]:
#             if i == "1":
#                 t += 1
#         return t