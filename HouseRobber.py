class Solution:
    def rob(self, nums: List[int]) -> int:
        incl = 0
        excl = 0
        for i in nums: 
          
        # Current max excluding i (No ternary in  
        # Python) 
            new_excl = excl if excl>incl else incl 
         
        # Current max including i 
            incl = excl + i 
            excl = new_excl 
      
    # return max of incl and excl 
        return (excl if excl>incl else incl) 
        
