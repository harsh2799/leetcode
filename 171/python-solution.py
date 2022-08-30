class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        num = 0
        columnTitle = columnTitle[::-1] 
        for x in range(0, len(columnTitle)):
            num += (26**x)*(ord(columnTitle[x])- ord("@"))
            
        return num