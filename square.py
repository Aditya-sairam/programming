#Valid square number or not
import math
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        
        root = math.sqrt(num)
        
        if int(root + 0.5) ** 2 == num:
            return True 
        
        return False
