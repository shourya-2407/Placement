// Brute force
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum >= target){
                    minLength = Math.min(minLength, j - i + 1);
                }
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}

// Optimised solution using sliding window
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0, minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum - nums[left] >= target && left <= right) {
                sum -= nums[left++];
            }

            if (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
            }

        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}

// Optimised and simple
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0, minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }

        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
