// solution using 2 pointers
class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1; 

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                continue;
            }
            nums[start++] = nums[i];
        }

        return start;
    }
}
