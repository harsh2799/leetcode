class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        row1 = "qwertyuiop"
        row2 = "asdfghjkl"
        row3 = "zxcvbnm"
        z = []
        for word in words:
            x = list(word.lower())
            inRow = True
            if x[0] in row1:
                for ltr in x:
                    if ltr not in row1:
                        inRow = False
                        break    
                    
            elif x[0] in row2:
                for ltr in x:
                    if ltr not in row2:
                        inRow = False
                        break    
            
            else:
                for ltr in x:
                    if ltr not in row3:
                        inRow = False
                        break    
            if inRow:
                z.append(word)

        return z