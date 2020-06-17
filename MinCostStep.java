//Minimum Cost steps in java
class MinCostStep {
    public int minCostClimbingStairs(int[] cost) {
        int firststep = 0;
        int secondstep = 0;
        int n = cost.length;
        for(int i=n-1;i>=0;--i){
            int finale = cost[i]+Math.min(firststep,secondstep);
            secondstep = firststep;
            firststep = finale;
        }
        return Math.min(firststep,secondstep);
    }
}
