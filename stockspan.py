# The stock span problem!
arr = list(map(int,input().split())) 

stack  = [] 

for i in range(1,len(arr)):
    count = 1
    j = i-1 
    while(arr[j] < arr[i] and j>=0):
        count+=1 
        j-=1
        
    stack.append(count)
    
for i in stack:
    print(i,end=" ")
    

        
