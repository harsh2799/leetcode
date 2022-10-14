class Solution:
    def breakPalindrome(self, palindrome: str) -> str:
        if len(palindrome) == 1:
            return ""
        
        for i in range(0, len(palindrome)//2):
            if not palindrome[i] == "a": 
                index = i
                return palindrome[:index] + "a" + palindrome[index+1:]
        
        return palindrome[:-1] + "b"
                