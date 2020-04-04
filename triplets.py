#Triplets whose sum is zero

arr = list(map(int,input().split())) 
a = []
b = []
arr.sort() 

for i in range(0,len(arr)-2):
    l = i+1 
    r = len(arr)-1 
    
    while(l < r):
        if(arr[i]+arr[l]+arr[r] == 0):
            a.append(arr[i])
            a.append(arr[l])
            a.append(arr[r])
            break 
        elif(arr[i]+arr[l]+arr[r] < 0):
            l+=1 
        else:
            r-=1
            
        
for i in a:
    print(i,end=" ")
        
