class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        
    
        nums = sorted(list(set(nums)))[::-1]
        if len(nums) < 3:
            return max(nums)
        return nums[2]