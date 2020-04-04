//Farthest jump leetcode problem
class Jump {
    public boolean canJumpFromPos(int pos,int[] arr){
        if(pos == arr.length-1){
            return true;
        }
        int further = Math.min(pos+arr[pos],arr.length-1);
        
        for(int nextpos = pos+1;nextpos<=further;nextpos++){
            if(canJumpFromPos(nextpos,arr)){
                return true;
            }
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        return canJumpFromPos(0,nums);
        
    }
}
