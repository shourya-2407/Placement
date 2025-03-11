// Brute Force
class Solution {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}

// Better approach using HashSet 
class Solution {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num; 
            }
            seen.add(num);
        }

        return -1; 
    }
}

// Optimal approach
// Leyarning: Use of linkedlist as the numbers are in the range [1, n] (not 0-based indices), index represents a node & value at an index represents the next node it points to.
// Identify an occurrence of cycle because of the duplicate value.
// Flyod's Algorithm: Use of slow and fast pointer to identify the duplicate element in the cycle.
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0]; 

        // Do while loop is used because the initial values are same. 
        // And hence to do a default iteration
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow!=fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
