class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        op = ""
            
        while columnNumber > 0:
            print(columnNumber)
            op = chr(ord("A") + (columnNumber - 1) %26) + op
            columnNumber = (columnNumber - 1) // 26    
                       
            
        return op