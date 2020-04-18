#Print all the elements that are greater than the previous elements in an array

n = int(input()) 
arr = list(map(int,input().split()))
a = []
max_so = arr[0] 
a.append(arr[0])
for i in range(1,n):
    if(arr[i] > max_so):
        a.append(arr[i]) 
        max_so = arr[i]
        
for i in a:
    print(i,end=" ")
