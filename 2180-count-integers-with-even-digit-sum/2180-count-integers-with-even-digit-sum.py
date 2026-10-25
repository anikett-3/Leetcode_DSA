class Solution:
    def countEven(self, num: int) -> int:
        count = 0
        for i in range(1,num+1):
            total  = 0
            temp = i

            while (temp >0):
                total = total + (temp%10)
                temp = temp//10
            
            if (total %2 == 0):
                count += 1
        return count
            
        