class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if not nums:
            return 0

        officer = 0
        unique = 1

        for cm in range(1, len(nums)):
            if nums[cm] != nums[officer]:
                officer += 1
                nums[officer] = nums[cm]
                unique += 1

        return unique