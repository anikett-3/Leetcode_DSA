class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1;

        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                ans=mid;
                hi=mid-1;
            }
            else{
                ans=mid+1;
                lo=mid+1;
            }
        }
        return ans;
    }
}