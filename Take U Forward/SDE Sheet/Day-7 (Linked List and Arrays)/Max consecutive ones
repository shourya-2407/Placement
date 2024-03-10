class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currsum = 0;
        int maxsum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currsum++;
            } else{
                maxsum = Math.max(currsum, maxsum);
                currsum = 0;
            }
        }
        maxsum = Math.max(currsum, maxsum);
        return maxsum;
    }
}
