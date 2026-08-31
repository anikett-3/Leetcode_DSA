// THIS SOLUTION WORKS ONLY ON SORTED ARRAY-
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length-1;
//         while(start<=end){
//             int sum = nums[start] +nums[end];
//             if(sum == target){
//                 return new int[]{start, end};
//             }
//             else if (sum>target){
//                 end --;
//             }
//             else{
//                 start++;
//             }

//         }
//         return null ;
        
//     }
// }
//



// NOW THIS IS OUR SOLUTION FOR UNSORTED ARRAY -->

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}