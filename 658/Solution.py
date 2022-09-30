class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        y = sorted([(a,abs(a-x)) for a in arr], key=lambda x: x[1])
        return sorted([a[0] for a in y][:k])
        