class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tempSum = 0, maxSum = 0;
        for(int i = 0; i< k ;i++)
            tempSum += cardPoints[i];
    
        maxSum = tempSum;
        
        if(k == cardPoints.length)
            return maxSum;
        
        int rightPointer = cardPoints.length-1;
        for(int i = k-1; i>= 0;i--){
            tempSum = tempSum + cardPoints[rightPointer] - cardPoints[i];
            rightPointer --;
            if(tempSum > maxSum)
                maxSum = tempSum;
        }
        
        return maxSum;
    }
}