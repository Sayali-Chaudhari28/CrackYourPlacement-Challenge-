class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeS = new ArrayList<>();
        Arrays.sort(nums);
        for(int num1Indx = 0; num1Indx + 2 < nums.length; num1Indx++){
            if(num1Indx > 0 && nums[num1Indx] == nums[num1Indx - 1]){
                continue;
            }
            int num2Indx = num1Indx + 1;
            int num3Indx = nums.length - 1;
            while(num2Indx < num3Indx){
                int sum = nums[num1Indx] + nums[num2Indx] + nums[num3Indx];
                if(sum == 0){
                    threeS.add(Arrays.asList(nums[num1Indx], nums[num2Indx], nums[num3Indx]));
                    num3Indx--;
                    while (num2Indx < num3Indx && nums[num3Indx] == nums[num3Indx + 1]) num3Indx--;
                }
                else if (sum > 0) {
                    num3Indx--;
                } 
                else {
                    num2Indx++;
                }
            }
        }
        return threeS;
    }
}