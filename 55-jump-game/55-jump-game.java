class Solution {
    public boolean canJump(int[] nums) {
        int position=0;
        for(int i=0; i<nums.length; i++){
            if(i>position)
                return false;
            position = Math.max(position, nums[i]+i);
        }
        return true;
    }
}