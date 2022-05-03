class Solution {
    public int findDuplicate(int[] nums) {
        int ans=nums.length;
        Arrays.sort(nums);
        for(int i=1; i<ans; i++){
            if(nums[i] == nums[i-1])
                ans = nums[i];
        }
        return ans;
        
    }
}