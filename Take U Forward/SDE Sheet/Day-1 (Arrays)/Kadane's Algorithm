// Logic: 
// Keep the addition of elemets to get the max sum
// And there is no point in carrying forward negative sums 
// So set currsum to 0, whenever it goes below 0

class Solution {    
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
