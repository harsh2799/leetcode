class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ccnt = 0
        maxcnt = 0
        for i in nums:
            ccnt = ccnt * i + i
            maxcnt = maxcnt if ccnt < maxcnt else ccnt

        return maxcnt