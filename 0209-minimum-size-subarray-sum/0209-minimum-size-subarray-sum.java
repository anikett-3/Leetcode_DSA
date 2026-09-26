class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int left = 0 ; 
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right <n ; right++){
            sum = sum + nums[right];

            //                     sum = sum + arr[right]
            // 1st itration hoga --> sum = 0 + 2 = 2
            // 2nd itration - sum =>  2 + arr[right which is  1 now ] ==> 2+3 = 5
            //now -> sum = 5
            // itration tak tak chalege jab tak --> sum >= target na ho 
            // jaise hi sum >= target hoga wo --> niche -->     WHILE LOOP ME ENTER KAREGA 

            // NOW SHRINKING OF ARRAY STARTING HERE  
            while(sum >= target){
                minLen = Math.min(minLen , right - left +1);  //yaha right= 3 and left= 0 --> 3-0+1= 4 
                // minLen = 4 now 
                sum = sum - nums[left];  // now sum hai abhi = 8 --> sum = 8-2 = 6
                left++;
                // left now 1 ho gya 
                // again this while loop check is --> sum>= target means --> 6>=7 ==> NO
                // now yeah ab upper wale for loop me jaega and 
                // so on-------........
            }
            
            
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
        
    }
}