class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = reverseDigit(x);
        return original == reverse;   
    }

    public int reverseDigit(int num){
        int reverseNum = 0;
        
        while(num!=0){
            int digit = num %10;

            reverseNum = reverseNum * 10 + digit;

            // removing last digit 
            num = num /10;
        }
        return reverseNum;
    }
}