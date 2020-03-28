#program to count the number of triplets,such that sum of any two is equal to the thir one

arr = list(map(int,input().split())) 
#sum = 0 
main = 0
stack = []

arr.sort()

for i in range(len(arr)):
    sum = 0
    try:
        stack.append(arr[i])
        stack.append(arr[i+1])
        
        while(len(stack) > 0):
            sum += stack.pop() 
        
        #print(sum)    
        if(sum == arr[i+2]):
            main+=1 
        else:
            pass 
        
    except:
        pass 
    
print(main)
