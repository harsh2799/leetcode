class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = dict()
        for i in s:
            d[i] = d.get(i, 0)+1
        
        for i in range(0, len(s)):
            if d[s[i]] == 1:
                return i
        
        return -1
        