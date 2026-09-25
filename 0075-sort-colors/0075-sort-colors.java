class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid= 0;
        int end = nums.length -1;
        while(mid<=end){
            if( nums[mid] == 2){
                // swap nums[mid], nums[end]
                int temp = nums[mid];
                nums [mid] = nums[end];
                nums[end] = temp;
                end --;
            }
            else if (nums[mid] == 0){
                // swap nums[mid], nums[start]
                int temp = nums[mid];
                nums[mid]= nums[start];
                nums[start] = temp;
                start ++;
                mid ++;
            }
            else {
                mid++;
            }
                
            

        }
    }
}


// class Solution {
//     public void sortColors(int [] nums){
//         int low = 0,   MID = 0,    high = nums.length-1;
//         while(mid<=high){
//             // we suppose -> --> - infinity to low yani --> -infinity to index 0 ===> 0 region
//             //              -->  + infinity to high + 1  == > 2 region 
//             // and          --> whole array is == 1 ka region yani --- "MID"
//             // hamne pura array from index 0  to index 5 tak {mid} manna hai 
//             // so we compare every element to MID
//            if( nums[MID] == 2){
//                 // swap nums[mid], nums[end] /// ////
//                 int temp = nums[mid];
//                 nums [mid] = nums[end];
//                 nums[end] = temp;
//                 end --;
//         }

//     }
// }
