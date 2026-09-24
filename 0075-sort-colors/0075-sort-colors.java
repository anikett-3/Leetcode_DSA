class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int left= 0;
        int right = nums.length -1;
        while(left<=right){
            if( nums[left] == 2){
                // swap nums[left], nums[right]
                int temp = nums[left];
                nums [left] = nums[right];
                nums[right] = temp;
                right --;
            }
            else if (nums[left] == 0){
                // swap nums[left], nums[start]
                int temp = nums[left];
                nums[left]= nums[start];
                nums[start] = temp;
                start ++;
                left ++;
            }
            else {
                left++;
            }
                
            

        }
    }
}

