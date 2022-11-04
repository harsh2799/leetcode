class Solution:
    def reverseVowels(self, s: str) -> str:
        x = [l for l in s]
        i=0
        j=len(x)-1
        
        vowels = 'aeiouAEIOU'
        
        while i<j:
            if x[i] in vowels and x[j] in vowels:
                temp = x[i]
                x[i] = x[j]
                x[j] = temp
                i+=1
                j-=1
            elif x[i] in vowels:
                j-=1
            elif x[j] in vowels:
                i+=1
            else:
                i+=1
                j-=1
        
        return ''.join(x)