class Solution {
    public int maxArea(int[] height) {
        int leftH = 0, rightH = height.length-1, maxArea = 0;
        while(leftH < rightH){
            int width = Math.abs(leftH-rightH);
            maxArea = Math.max(maxArea, Math.min(height[leftH], height[rightH])*width);
            if(height[leftH] < height[rightH]){
                leftH++;
            }
            else{
                rightH--;
            }
        }
        return maxArea;
    }
}