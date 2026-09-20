class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    res.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}





// // -----------------------------------------------------------------------------------------------------

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//         // This will store all valid triplets
//         List<List<Integer>> res = new ArrayList<>();

//         // Sorting is important because:
//         // 1. It allows us to use the two-pointer technique.
//         // 2. It makes it easy to skip duplicates.
//         Arrays.sort(nums);

//         // We need at least 3 numbers, so i can go only up to nums.length - 3
//         for (int i = 0; i < nums.length - 2; i++) {

//             // If the current number is the same as the previous number,
//             // skip it because we already processed this starting number.
//             //
//             // Example:
//             // [-1, -1, 0, 1]
//             //     ↑
//             // The second -1 would generate the same triplets.
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             // left starts immediately after i
//             int left = i + 1;

//             // right starts at the last element
//             int right = nums.length - 1;

//             // Keep searching while left and right have not crossed
//             while (left < right) {

//                 // Try to find:
//                 // nums[i] + nums[left] + nums[right] == 0
//                 int sum = nums[i] + nums[left] + nums[right];

//                 // If sum is too small, we need a bigger number.
//                 // Since the array is sorted, move left forward.
//                 if (sum < 0) {
//                     left++;
//                 }

//                 // If sum is too large, we need a smaller number.
//                 // Since the array is sorted, move right backward.
//                 else if (sum > 0) {
//                     right--;
//                 }

//                 // We found a valid triplet
//                 else {

//                     // Store the triplet
//                     res.add(Arrays.asList(
//                         nums[i],
//                         nums[left],
//                         nums[right]
//                     ));

//                     // We already used these two values.
//                     // Move both pointers to search for another pair.
//                     left++;
//                     right--;

//                     // Skip duplicate values on the left.
//                     //
//                     // Example:
//                     // [-4, 1, 1, 3, 3]
//                     //        ↑
//                     // If the previous left value was also 1,
//                     // using this 1 would produce the same triplet.
//                     while (left < right &&
//                            nums[left] == nums[left - 1]) {
//                         left++;
//                     }

//                     // Skip duplicate values on the right.
//                     //
//                     // Example:
//                     // [-4, 1, 1, 3, 3]
//                     //             ↑
//                     // If the previous right value was also 3,
//                     // using this 3 would produce the same triplet.
//                     while (left < right &&
//                            nums[right] == nums[right + 1]) {
//                         right--;
//                     }
//                 }
//             }
//         }

//         // Return all unique triplets
//         return res;
//     }
// }
