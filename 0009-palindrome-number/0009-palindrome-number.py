
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        original = x
        rev = 0

        while x > 0:
            a = x % 10
            rev = rev * 10 + a
            x = x // 10

        return original == rev

        