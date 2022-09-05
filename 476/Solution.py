class Solution:
    def findComplement(self, num: int) -> int:
        if num == 0:
            return 1
        x = str(bin(num)[2:])
        return num^(int("1"*len(x), base=2))