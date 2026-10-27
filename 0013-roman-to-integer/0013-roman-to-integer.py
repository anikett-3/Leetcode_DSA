class Solution:
    def romanToInt(self, nums: str) -> int:
        roman = {'I': 1,'V': 5,'X': 10,'L': 50,'C': 100,'D': 500,'M': 1000}
        if not nums:
            return 0
        ans = 0
        for i in range(len(nums)-1):
            if roman[nums[i]] < roman[nums[i+1]]:
                ans -= roman[nums[i]]
            else:
                ans += roman[nums[i]]
        ans += roman[nums[-1]]
        return ans