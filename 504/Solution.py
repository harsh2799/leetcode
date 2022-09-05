class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"
        x = []
        neg = False
        temp = abs(num)
        while temp:
            x.append(str(temp%7))
            temp = temp//7
        
        return "-"*(num<0) + "".join(x[::-1])