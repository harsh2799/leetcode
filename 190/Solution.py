# left shift the res by 1 and xor with current bit and right shift value of n by 1 bit.

class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0
        for i in range(0,32):
            res <<= 1
            res ^= n%2
            n >>= 1
        return res
		