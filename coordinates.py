#Checiking equation for straight line
class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        
        n = len(coordinates)
        x0,y0 = coordinates[0]
        x1,y1 = coordinates[1]
        
        for i in range(2,n):
            x,y = coordinates[i]
            if (y1-y0)*(x-x0) != (y-y0)*(x1-x0):
                return False 
            
        return True
