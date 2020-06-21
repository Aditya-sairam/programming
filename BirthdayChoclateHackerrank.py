//Birthday choclate problem in hackerrank 
def birthday(s, d, m):
    res = 0
    for i in range(0,n-m+1):
        sumo = sum(s[i:i+m])  
        if sumo == d:
            res += 1 

    return res
