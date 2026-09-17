// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length; i++) {
//             if (i > 0 && nums[i] == nums[i-1]) {
//                 continue;
//             }
            
//             int j = i + 1;
//             int k = nums.length - 1;

//             while (j < k) {
//                 int total = nums[i] + nums[j] + nums[k];

//                 if (total > 0) {
//                     k--;
//                 } else if (total < 0) {
//                     j++;
//                 } else {
//                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;

//                     while (nums[j] == nums[j-1] && j < k) {
//                         j++;
//                     }
//                 }
//             }
//         }
//         return res;        
//     }

// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;

            // int sum = -1 * a[i]; // ye line nhi likhenge qk hame sum = 0 chahiye /// if likhte then har jagah total to sum se compare karte na ki 0 se 
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total == 0 ){

                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));/////// important line

                    left++;
                    right--;
                    while(left< nums.length && nums[left] == nums[left]-1){
                        left++;
                    }
                    while(right >=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if (total < 0) {
                    left++;
                } else {
                   right--;
                }
            }
        }
        return res;        
    }
}
