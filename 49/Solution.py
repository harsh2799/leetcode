class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = dict()
        for word in strs:
            x = ''.join(sorted([w for w in word]))
            if anagrams.get(x):
                anagrams[x].append(word)
            else:
                anagrams[x] = [word]
                
        return anagrams.values()