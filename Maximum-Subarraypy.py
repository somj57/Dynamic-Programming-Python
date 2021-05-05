class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return nums[0]
        n = len(nums)
        maxi = [0]*n
        maxi[n-1] = nums[n-1]
        for i in range(n-2,-1,-1):
            maxi[i] = max(nums[i],nums[i]+maxi[i+1])
        return max(maxi)
        