class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         x = dict()
#         y = dict()
#         for ltr in s:
#             if ltr in x:
#                 x[ltr] += 1
#             else:
#                 x[ltr] = 1
                
#         for ltr in t:
#             if ltr in y:
#                 y[ltr] += 1
#             else:
#                 y[ltr] = 1
                
#         for key in x:
#             if not (key in y and y[key] == x[key]):
#                 return False
#             else:
#                 del y[key]
#         if y:
#             return False
#         else:
#             return True
        
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(list(s)) == sorted(list(t))

        
            