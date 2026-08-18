// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int off = 0;
//         int unique = 1;
//         int cm = 1;
//         while(cm <arr.length){
//             if (arr[cm] == arr[off]){
//                 cm++;  // duplicate mila → next element par pointer le jao
//                 continue;     // baki unique-element wala code SKIP karo
//             }             
//           // Ye code sirf unique milne par chalna chahiye
//             arr[off+1] = arr[cm];
//             off++;
//             unique++;
//             cm++;
//         }

//         return unique;

//     }
// }




class Solution {
    public int removeDuplicates(int[] arr) {
        int officer = 0;
        int unique = 1;

        for(int cm = 1; cm <arr.length; cm ++){
            if (arr[cm] != arr[officer]){
                arr[officer + 1] = arr[cm];
                officer ++;
                unique++;

            }
        }
        return unique;

    }
}



//or 

// class Solution {
//     public int removeDuplicates(int[] arr) {

//         int officer = 0;

//         for (int cm = 1; cm < arr.length; cm++) {

//             if (arr[cm] != arr[officer]) {
//                 officer++;
//                 arr[officer] = arr[cm];
//             }
//         }

//         return officer + 1;
//     }
// }