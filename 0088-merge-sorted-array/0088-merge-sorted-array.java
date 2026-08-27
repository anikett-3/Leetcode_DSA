// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int i = m - 1;      // Last valid element in nums1
//         int j = n - 1;      // Last element in nums2
//         int k = m + n - 1;  // Last index of nums1

//         while (i >= 0 && j >= 0) {
//             if (nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 i--;
//             } else {
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }

//         // Copy remaining elements of nums2 (if any)
//         while (j >= 0) {
//             nums1[k] = nums2[j];
//             j--;
//             k--;
//         }
//     }
// }


import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){

        int result[] = new int[m+n];

        int i = 0,  j = 0,  index = 0;

        while (i<m && j<n){
            if (nums1[i] <= nums2[j]){
                result[index] = nums1[i];
                i++;
                index++;
            }
            else{
                result[index] = nums2[j];
                j++;
                index++;

            }
        }
        while(j<n){
            result[index] = nums2[j];
            j++;
            index++;
        }
        while(i<m){
            result[index] = nums1[i];
            i++;
            index++;
        }
        for (int k = 0;k<m+n; k++){
            nums1[k] = result[k];
        }

    }     
}