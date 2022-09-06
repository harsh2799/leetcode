class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        lastBit = n%2
        n >>= 1
        while n>0:
            if lastBit == (n&1):
                return False
            
            lastBit = n&1
            n >>= 1
            
        return True