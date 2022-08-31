class Solution:
    def fib(self, n: int) -> int:
        i,j,sum = 0,1,0
        if n==0:
            return 0
        if n==1:
            return 1
        
        for x in range(2,n+1):
            sum = i+j
            i = j
            j = sum
        
        return j
    
	