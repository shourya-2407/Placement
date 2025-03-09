// Brute force
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            for(int j = i; j < nums.length; j++){
                prod *= nums[j];
                if(prod < k){
                    cnt++;
                } else {
                    break;
                }
            }
        }

        return cnt;
    }
}

// Optimised approach using variable sliding window
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int cnt = 0, prod = 1;
        int left = 0;

        for(int right = 0; right < nums.length; right++){    
            prod *= nums[right];
            while(prod >= k && left <= right){
                prod /= nums[left++]; 
            }
            cnt += (right - left + 1);
        }

        return cnt;
    }
}
