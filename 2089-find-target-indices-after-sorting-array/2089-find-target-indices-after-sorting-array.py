class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        nums.sort()
        newlst = []
        for i in range(len(nums)):
            if nums[i] == target:
                newlst.append(i)
        return newlst