class Solution:
    def fib(self, n: int) -> int:
        if(n==0):
            return 0
        if (n==1):
            return 1
        last = self.fib(n-1)
        secondLast = self.fib(n-2)
        ans = last + secondLast
        return ans


#  approach 2
class Solution:
    def fib(self, n: int) -> int:
        if n <= 1:
            return n
        return self.fib(n - 1) + self.fib(n - 2)