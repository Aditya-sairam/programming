#Mimimum steps to make a string empy by removing palindromi sub sequences consisting only of a's and b's-Leetcode problem

class Solution:
    def removePalindromeSub(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if s == s[::-1]:
            return 1 
        
        n = len(s) 
        isbool = True
        
        for i in range(len(s)-1):
            if(s[i] != s[len(s)-1-i]):
                isbool = False 
                break 
                
        if isbool:
            return 1 
        else:
            return 2
        
