//Number of ways to vlimb the stairs 

class ClimbStairs {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int[] arr = new int[n+2];
        
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        int i;
        for(i=3;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
