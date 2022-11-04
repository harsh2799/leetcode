class Solution:
    def countBits(self, n: int) -> List[int]:
        ls = [0]*(n+1)
        offset = 0
        for i in range(1, n+1):
            if i < 2**(offset+1):
                ls[i] = 1 + ls[i-(2**offset)]
            else:
                offset += 1
                ls[i] = 1 + ls[i-2**offset] 
        
        return ls
        
        