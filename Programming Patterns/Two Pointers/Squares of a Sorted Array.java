// Brute force
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}

// Optimised approach using 2 pointers
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = nums.length - 1, j = n - 1;

        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                ans[j--] = nums[right]*nums[right];
                right--;
            } else {
                ans[j--] = nums[left]*nums[left];
                left++;
            }
        }
        
        return ans;
    }
}
